package com.atguigu.guli.service.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;


@Data
public class BaseEntity {
    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtModified;
}
