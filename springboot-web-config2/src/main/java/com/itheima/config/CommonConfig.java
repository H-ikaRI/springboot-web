package com.itheima.config;

import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * ClassName: CommonConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/11/21 22:53
 * @Version 1.0
 */
@Configuration//配置类
public class CommonConfig {
    @Bean
    public SAXReader saxReader(){
        return new SAXReader();
    }
}
