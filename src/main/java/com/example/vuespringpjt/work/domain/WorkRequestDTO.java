package com.example.vuespringpjt.work.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WorkRequestDTO {
    private Integer id;
    private String subject;
    private String content;
    private Boolean completed;
}
