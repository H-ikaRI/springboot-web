package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author: Hjr
 * @Create 2023/10/28 18:08
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> list();
}
