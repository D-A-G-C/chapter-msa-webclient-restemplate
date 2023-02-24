package com.pichincha.chapter.msa.webclient.restemplate.helper.restapi.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.restapi.RestTemplateCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Slf4j
@Service
public class RestTemplateCallImpl implements RestTemplateCall {
    private final String urlService;
    @Autowired
    private RestTemplate restTemplate;

    public RestTemplateCallImpl(@Value("${external.url.web-service}") String urlService) {
        this.urlService = urlService;
    }

    @Override
    public PersonDto restTemplate() {

        HttpEntity<PersonDto> httpEntity = new HttpEntity<>(setHeaders());
        String url = urlService + "/03e64f0f-f811-40df-9554-0d09a6f07bab";
        ResponseEntity<PersonDto> responseEntity = restTemplate.exchange(url,
                HttpMethod.GET, httpEntity, PersonDto.class);
        return responseEntity.getBody();
    }

    private HttpHeaders setHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return httpHeaders;
    }
}
