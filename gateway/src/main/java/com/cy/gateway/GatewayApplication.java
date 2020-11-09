package com.cy.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * Description:  {一句话描述类是干什么的}<br/>
 *
 * @author chenyu
 * @version 1.0
 * @date: 2020/11/9 16:20
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GatewayApplication.class);
        Environment env = application.run(args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("Gateway地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }
}
