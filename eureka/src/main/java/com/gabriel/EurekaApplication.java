package com.gabriel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;


/**
 * @author Gabriel
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        Environment environment = SpringApplication.run(EurekaApplication.class, args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("Eureka地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
