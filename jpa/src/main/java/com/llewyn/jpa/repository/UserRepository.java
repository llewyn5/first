package com.llewyn.jpa.repository;

import com.llewyn.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承jparepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {

}
