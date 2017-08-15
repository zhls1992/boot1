package com.thor.ode.boot1.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO:
 * Date:2017/8/15 22:34
 * Created by 赵雷颂 ,zhls1992@qq.com
 */
@Component
@Data
public class OdeProperties {
    @Value("${com.thor.ode.author}")
    private String author;
    @Value("${com.thor.ode.email}")
    private String email;
}
