package com.example.web.listener;

import com.example.web.mapping.SpecialHandlerMapping;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by dwb on 2017/6/16.
 */
@Component
public class ContextRefreshListener implements ApplicationListener<ContextRefreshedEvent> ,ApplicationContextAware{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) throws BeansException, IllegalArgumentException {
        SpecialHandlerMapping specialHandlerMapping = (SpecialHandlerMapping)this.context.getBean("specialHandlerMapping");
        specialHandlerMapping.registerHandler("/wahaha",this.context.getBean("specialHandler"));

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    private ApplicationContext context;
}
