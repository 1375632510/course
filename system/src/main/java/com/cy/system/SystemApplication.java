package com.cy.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * Description:  {一句话描述类是干什么的}<br/>
 *
 * @author chenyu
 * @version 1.0
 * @date: 2020/11/9 16:03
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.cy")
@MapperScan("com.cy.server.mapper")
public class SystemApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SystemApplication.class);
        Environment env = application.run(args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("System地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
