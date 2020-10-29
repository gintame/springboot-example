package com.it.config;

import com.it.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是配置类
 *
 * @Bean 标签旧对应着"<bean><bean/>"
 */
@Configuration
public class MyAppConfig {

    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("使用注解方式替代spring配置组件");
        return new HelloService();
    }
}
