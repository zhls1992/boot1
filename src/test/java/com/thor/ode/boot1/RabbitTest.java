package com.thor.ode.boot1;

import com.thor.ode.boot1.rabbit.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO:
 * Date:2017/8/17 22:57
 * Created by 赵雷颂 ,zhls1992@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
}
