package com.aliyun.oss;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AilOSSAutoConfiguration
 * Package: com.aliyun.oss
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/11/23 19:23
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(AilOSSProperties.class)
public class AilOSSAutoConfiguration {
    @Bean
    public AliOSSUtils aliOSSUtils(AilOSSProperties ailOSSProperties){
        AliOSSUtils aliOSSUtils = new AliOSSUtils();
        aliOSSUtils.setAilOSSProperties(ailOSSProperties);
        return aliOSSUtils;
    }

}
