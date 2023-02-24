package com.pichincha.chapter.msa.webclient.restemplate.controller;

import com.pichincha.chapter.msa.webclient.restemplate.service.WebClientService;
import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping
public class WebClientController {

    private final WebClientService webCliRestService;

    @GetMapping(value = "/web-client")
    public List<ResponseDto> getWebClient() {
        log.info("Get External Service EndPoint with Web Client");
        return webCliRestService.getWebClient();
    }

}
