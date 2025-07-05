package org.example.myblog.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.myblog.dto.UserDto;
import org.example.myblog.repository.UserRepository;
import org.example.myblog.service.UserService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceimpl implements UserService {

    final UserRepository userRepository;

    // Signup
    @Override
    public UserDto.SignupResDto signup(UserDto.SignupReqDto signupReqDto){
        UserDto.SignupResDto res = userRepository.save(signupReqDto.toEntity()).toSignupResDto();

        return res;
    }
}
