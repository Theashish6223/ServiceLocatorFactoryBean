package com.ashish.springdemo.service;

public interface DataConverterService<T, U> {
    U convert(T t);
}
