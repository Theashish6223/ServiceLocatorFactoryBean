package com.ashish.springdemo;

import com.ashish.springdemo.servicelocator.config.DataConverterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private DataConverterFactory dataConverterFactory;

    @Override
    public void run(String... args) throws Exception {
        this.dataConverterFactory.getConverter("stringToJsonConverterService").convert("test");
        this.dataConverterFactory.getConverter("stringToJsonConverterService").convert("test");
    }
}
