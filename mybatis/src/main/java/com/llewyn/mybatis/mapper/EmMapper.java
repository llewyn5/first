package com.llewyn.mybatis.mapper;


import com.llewyn.mybatis.bean.Em;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//指定这是一个操作数据库的Mapper
@Mapper
public interface EmMapper {
    @Select("select * from Em where id = #{id}")
    public Em getId(Integer id);
    //@Options(useGeneratedKeys = true,keyProperty = "id"
    //@insert("insert into ")
}
