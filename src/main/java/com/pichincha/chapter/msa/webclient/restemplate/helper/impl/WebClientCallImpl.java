package com.pichincha.chapter.msa.webclient.restemplate.helper.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.WebClientCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
public class WebClientCallImpl implements WebClientCall {


    private final String urlService;
    @Autowired
    private WebClient webClientCall;

    public WebClientCallImpl(@Value("${external.url.web-service}") String urlService) {
        this.urlService = urlService;
    }


    public WebClient setHeaders(String url) {
        return org.springframework.web.reactive.function.client.WebClient.builder()
                .baseUrl(url)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public PersonDto webClient() {
        //webClientCall = setHeaders(urlService);
        return webClientCall
                .get()
                .uri("/03e64f0f-f811-40df-9554-0d09a6f07bab")
                .retrieve()
                .bodyToMono(PersonDto.class)
                .block();
    }
}