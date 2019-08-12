package com.pradeep.emailServer.repository;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.emailServer.entity.Mail;


public interface MailRepository extends CrudRepository<Mail, Long> {

}