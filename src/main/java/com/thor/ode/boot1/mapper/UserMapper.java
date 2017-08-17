package com.thor.ode.boot1.mapper;

import com.thor.ode.boot1.entity.UserEntity;
import com.thor.ode.boot1.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user_entity")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM user_entity WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "nickName", column = "nick_name")
    })
    UserEntity getOne(Long id);

    @Insert("INSERT INTO user_entity(user_name,user_sex) VALUES(#{userName}, #{userSex})")
    void insert(UserEntity user);

    @Update("UPDATE user_entity SET user_name=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(UserEntity user);

    @Delete("DELETE FROM user_entity WHERE id =#{id}")
    void delete(Long id);

}