package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //在运行时,会自动生成该接口的 实现类对象(动态代理对象), 并且将该对象交给IOC容器管理，DI依赖注入
public interface UserMapper {

    //查询全部用户信息，执行SQL语句
    @Select("select * from user")
    public List<User> list();

}
