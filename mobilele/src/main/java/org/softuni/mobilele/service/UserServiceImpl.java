package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        System.out.println(userRegistrationDTO);
    }
}
