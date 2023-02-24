package com.pichincha.chapter.msa.webclient.restemplate.controller;

import com.pichincha.chapter.msa.webclient.restemplate.service.FeignService;
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
public class FeignController {

    private final FeignService feignService;

    @GetMapping(value = "/feign")
    public List<ResponseDto> getRestTemplate() {
        log.info("Get External Service EndPoint with FEign");
        return feignService.getFeign();
    }
}
