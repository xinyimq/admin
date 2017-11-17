package com.yxb.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring boot 主类入口测试
 *
 * @author yangxiaobing
 * @date 2017/7/27
 */
@SpringBootApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


	
    public static void main(String[] args) throws Exception {
    	SpringApplication.run(Application.class, args);  
    }
}

