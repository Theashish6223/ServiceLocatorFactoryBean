package com.ashish.springdemo.service.converter;

import com.ashish.springdemo.service.DataConverterService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StringToJsonConverterService implements DataConverterService<String, JSONPObject> {

    @Override
    public JSONPObject convert(String s) {
        System.out.println("converting string to json object");
        return null;
    }
}
