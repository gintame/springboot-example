package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在pom文件中，排除了spring默认的日志实现框架lockback，而使用了log4j2
 * 在pom文件中可以右键show diagrams清除的查看日志间的依赖关系，并且可以依赖右键移除
 * 在不同的功能模块中，我们要统一日志框架，旧需要将别的框架日志移除。
 * 但有些依赖是其他模块所必须的，所以我们可以引用转换的日志门面jar包。默认已经引入了一些。具体可以看依赖结构图
 *
 * 【补充】
 * springboot一般都slf4j日志门面
 * springboot默认的框架实现是lockback
 *
 * 【重要】
 * 在使用配置文件时，命名规则最好为:实现框架名称-spring.xml。 如：logback-spring.xml,这样可以开启spring的一些额外功能
 *
 */
@SpringBootApplication
public class SpringBootLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);
	}

}
