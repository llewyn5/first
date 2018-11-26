package com.llewyn.jpa.entity;


import javax.persistence.*;

//使用jpa注解配置映射关系
@Entity//告诉jpa这是个实体类（和数据库表映射
@Table(name = "tbl-user")//指定和哪个数据表对应，如省略默认是user

public class User {

    @Id//这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "lastname",length = 50) //这是和数据库表对应的一个列
    private String lastname;
    @Column//省略默认列名就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
