package com.gabriel.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author Gabriel
 */
@SpringBootApplication
public class SystemApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        Environment environment = SpringApplication.run(SystemApplication.class, args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("System地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
