package com.xtu.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Ilovezilian on 2017/4/11.
 */
@Configuration
@Import({LoginConfig.class, MysqlConfig.class})
@ComponentScan(basePackages = "com.xtu",
        excludeFilters = {
                @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
//@ImportResource("classpath:config.xml");
@EnableAspectJAutoProxy
public class RootConfig{
}
