package com.pichincha.chapter.msa.webclient.restemplate.service;

import com.pichincha.chapter.msa.webclient.restemplate.service.dto.ResponseDto;

import java.util.List;

public interface FeignService {
    List<ResponseDto> getFeign();

}
