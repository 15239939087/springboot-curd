package com.example.polls.mapper;

import com.example.polls.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * from cci_user")
    List<User> findAll();

    @Insert("INSERT into cci_user(username, password, nickname, phone, address) VALUES (#{username}, #{password}, #{nickname}, #{phone}, #{address})")
    int insert(User user);

    // @Update("UPDATE cci_user set username = #{username}, password=#{password}, nickname=#{nickname}, email=#{email}, phone=#{phone}, address=#{address} where id = #{id}")
    int update(User user);

    // 删除
    @Delete("delete from cci_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);
}
