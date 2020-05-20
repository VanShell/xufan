package com.beauty.consumer.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ImportResource({"classpath*:beauty-share-shop-consumer.xml"})
@PropertySource(value = {"classpath:beauty-share-shop-consumer.properties"})
public class DubboConfig {
}
