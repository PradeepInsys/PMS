package com.pradeep.userServer.repository;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.userServer.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {

}