package com.gabriel.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author Gabriel
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        Environment environment = SpringApplication.run(GatewayApplication.class, args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("Gateway地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
