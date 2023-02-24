package com.pichincha.chapter.msa.webclient.restemplate.helper.restapi;

import com.pichincha.chapter.msa.webclient.restemplate.service.dto.external.PersonDto;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "names", url = "${external.url.web-service}")
public interface FeignCall {

    @GetMapping(value = "/03e64f0f-f811-40df-9554-0d09a6f07bab")
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    PersonDto getFeign();
}
