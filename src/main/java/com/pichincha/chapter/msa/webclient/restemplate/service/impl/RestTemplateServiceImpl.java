package com.pichincha.chapter.msa.webclient.restemplate.service.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.RestTemplateCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.RestTemplateService;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RestTemplateServiceImpl implements RestTemplateService {

    private final RestTemplateCall restTemplateCall;

    public List<ResponseDto> getRestTemplate() {
        PersonDto persons = restTemplateCall.restTemplate();
        ResponseDto responseDto = new ResponseDto(persons.getName() + " from " + persons.getCity());
        return List.of(responseDto);
    }

}
