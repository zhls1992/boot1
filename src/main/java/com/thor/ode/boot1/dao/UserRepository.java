package com.thor.ode.boot1.dao;

import com.thor.ode.boot1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO:
 * Date:2017/8/15 22:54
 * Created by 赵雷颂 ,zhls1992@qq.com
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);
}
