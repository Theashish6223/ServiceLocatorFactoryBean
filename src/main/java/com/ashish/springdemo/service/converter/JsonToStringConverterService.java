package com.ashish.springdemo.service.converter;

import com.ashish.springdemo.service.DataConverterService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JsonToStringConverterService implements DataConverterService<JSONPObject, String> {
    @Override
    public String convert(JSONPObject jsonpObject) {
        System.out.println("Converting json to String");
        return null;
    }
}
