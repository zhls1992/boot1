package com.thor.ode.boot1.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO:
 * Date:2017/8/17 22:31
 * Created by 赵雷颂 ,zhls1992@qq.com
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
