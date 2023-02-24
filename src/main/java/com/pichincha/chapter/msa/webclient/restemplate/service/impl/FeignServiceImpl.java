package com.pichincha.chapter.msa.webclient.restemplate.service.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.restapi.FeignCall;
import com.pichincha.chapter.msa.webclient.restemplate.helper.restapi.RestTemplateCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.FeignService;
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
public class FeignServiceImpl implements FeignService {

    private final FeignCall feignCall;

    public List<ResponseDto> getFeign() {
        PersonDto persons = feignCall.getFeign();
        ResponseDto responseDto = new ResponseDto(persons.getName() + " from " + persons.getCity());
        return List.of(responseDto);
    }

}
