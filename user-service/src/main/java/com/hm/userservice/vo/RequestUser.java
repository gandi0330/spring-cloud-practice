package com.hm.userservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class RequestUser {

    private String email;
    private String name;
    private String pwd;
}
