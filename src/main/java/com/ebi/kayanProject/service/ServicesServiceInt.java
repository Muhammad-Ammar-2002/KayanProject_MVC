package com.ebi.kayanProject.service;

import com.ebi.kayanProject.model.LoginUserDto;
import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.model.UserDto;

import java.util.List;

public interface ServicesServiceInt {
public ServicesDto getServiceById(Long id);
public List<ServicesDto> getAllServices();
}
