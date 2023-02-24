package com.pichincha.chapter.msa.webclient.restemplate.service.impl;

import com.pichincha.chapter.msa.webclient.restemplate.helper.WebClientCall;
import com.pichincha.chapter.msa.webclient.restemplate.service.WebClientService;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebClientServiceImpl implements WebClientService {

    private final WebClientCall webClientCall;

    public List<ResponseDto> getWebClient() {
        PersonDto persons = webClientCall.webClient();
        ResponseDto responseDto = new ResponseDto(persons.getName() + " from " + persons.getCity());
        return List.of(responseDto);
    }

}
