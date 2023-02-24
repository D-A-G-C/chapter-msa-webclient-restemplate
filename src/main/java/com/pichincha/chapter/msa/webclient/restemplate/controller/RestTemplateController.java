package com.pichincha.chapter.msa.webclient.restemplate.controller;

import com.pichincha.chapter.msa.webclient.restemplate.service.RestTemplateService;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping
public class RestTemplateController {

    private final RestTemplateService restTemplateService;

    @GetMapping(value = "/rest-template")
    public List<ResponseDto> getRestTemplate() {
        log.info("Get External Service EndPoint with Rest Template");
        return restTemplateService.getRestTemplate();
    }
}
