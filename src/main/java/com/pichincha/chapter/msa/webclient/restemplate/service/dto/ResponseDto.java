package com.pichincha.chapter.msa.webclient.restemplate.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private String personNameCity;
    private String localDateTime;
    private Boolean status = Boolean.TRUE;

    public ResponseDto(String personNameCity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.personNameCity = personNameCity;
        localDateTime = LocalDateTime.now().format(formatter);
        status = Boolean.TRUE;
    }

}
