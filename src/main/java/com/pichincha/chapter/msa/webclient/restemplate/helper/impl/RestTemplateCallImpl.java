package com.pichincha.chapter.msa.webclient.restemplate.helper.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.RestTemplateCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@AllArgsConstructor
public class RestTemplateCallImpl implements RestTemplateCall {
    private RestTemplate restTemplate;

    @Override
    public PersonDto restTemplate() {
        return null;
    }
}
