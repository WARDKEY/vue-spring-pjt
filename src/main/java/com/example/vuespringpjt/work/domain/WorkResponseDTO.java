package com.example.vuespringpjt.work.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;

@Setter
@Getter
@ToString
public class WorkResponseDTO {
    private Integer id;
    private String subject;
    private String content;
    private Boolean completed;
}
