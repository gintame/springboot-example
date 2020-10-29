package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * "@ImportResource"可以加载指定位置的spring配置文件（xml文件），但是不推荐
 *
 * 推荐使用@Configuration注解的方式替代spring配置文件，可以看{@link com.it.config.MyAppConfig}
 */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigApplication.class, args);
	}

}
