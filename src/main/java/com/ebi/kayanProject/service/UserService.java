package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.UserEntity;
import com.ebi.kayanProject.exception.CustomException;
import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.UserDto;
import com.ebi.kayanProject.repo.UserRepoInt;
import org.modelmapper.ModelMapper;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService implements UserServiceInt {
    private final UserRepoInt userInt;
    private  final ModelMapper modelMapper =new ModelMapper();
//    private  final BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

    public UserService(UserRepoInt userInt) {
        this.userInt = userInt;

    }

    @Override
    public UserDto RegisterUser(UserDto userDto) {
//            userDto.setPassword(encoder.encode(userDto.getPassword()));
            return modelMapper.map((userInt.save(modelMapper.map(userDto, UserEntity.class))), UserDto.class);

    }

    @Override
    public LoginUserDto LoginUser(LoginUserDto loginUserDto) {
        LoginUserDto userDto = new LoginUserDto();
        userDto.setEmail(loginUserDto.getEmail());
        userDto.setPassword(loginUserDto.getPassword());
        return userDto;
    }






//    public UserDto getUserDto(UserEntity userEntity) {
//        UserDto userDto = new UserDto();
//        userDto.setId(userEntity.getId());
//        userDto.setPhone(userEntity.getPhone());
//        userDto.setEmail(userEntity.getEmail());
//        userDto.setPassword(userEntity.getPassword());
//        userDto.setAddress(userEntity.getAddress());
//        userDto.setFName(userEntity.getFName());
//        userDto.setLName(userEntity.getLName());
//        userDto.setJobTitle(userEntity.getJobTitle());
//        return userDto;
//    }
//    public UserEntity getUserEntity(UserDto userDto) {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setId(userDto.getId());
//        userEntity.setPhone(userDto.getPhone());
//        userEntity.setEmail(userDto.getEmail());
//        userEntity.setPassword(userDto.getPassword());
//        userEntity.setFName(userDto.getFName());
//        userEntity.setLName(userDto.getLName());
//        userEntity.setAddress(userDto.getAddress());
//        userEntity.setJobTitle(userDto.getJobTitle());
//        return userEntity;
//    }
    public LoginUserDto getLoginUserDto(UserEntity userEntity) {
        LoginUserDto loginUserDto = new LoginUserDto();
        loginUserDto.setEmail(userEntity.getEmail());
        loginUserDto.setPassword(userEntity.getPassword());
        return loginUserDto;
    }

}
