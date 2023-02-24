package com.pichincha.chapter.msa.webclient.restemplate.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private final String urlService;

    public WebClientConfig(@Value("${external.url.web-service}") String urlService) {   //web-service
        this.urlService = urlService;
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(urlService)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
