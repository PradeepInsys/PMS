package com.pradeep.emailServer.service;

import com.pradeep.emailServer.entity.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);
}
