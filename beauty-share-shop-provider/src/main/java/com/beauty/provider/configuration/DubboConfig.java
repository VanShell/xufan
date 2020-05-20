package com.beauty.provider.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ImportResource({"classpath*:beauty-share-shop-provider.xml"})
@PropertySource(value = {"classpath:beauty-share-shop-provider.properties"})
public class DubboConfig {
}
