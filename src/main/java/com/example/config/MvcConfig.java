package com.example.config;

import com.example.web.handler.SpecialHandler;
import com.example.web.mapping.SpecialHandlerMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dwb on 2017/6/14.
 */
@Configuration
public class MvcConfig {

    @Bean
    public SpecialHandler specialHandler(){
        return new SpecialHandler();
    }

    @Bean
    public SpecialHandlerMapping specialHandlerMapping(SpecialHandler specialHandler){
        return new SpecialHandlerMapping(specialHandler);
    }

}
