package com.ashish.springdemo.servicelocator.config;

import com.ashish.springdemo.service.DataConverterService;

public interface DataConverterFactory {
    public DataConverterService getConverter(String converterName);
}
