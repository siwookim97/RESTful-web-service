package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 생성자가 자동으로 생기는 어노테이션
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
