package com.cy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

/**
 * Description:  {一句话描述类是干什么的}<br/>
 *
 * @author chenyu
 * @version 1.0
 * @date: 2020/11/9 14:28
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    private static final Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(EurekaApplication.class, args);
        SpringApplication application = new SpringApplication(EurekaApplication.class);
        Environment env = application.run(args).getEnvironment();
        logger.info("启动成功！");
        logger.info("Eurekad地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }
}
