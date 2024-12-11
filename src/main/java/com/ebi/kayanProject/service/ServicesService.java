package com.ebi.kayanProject.service;

import com.ebi.kayanProject.entity.ServicesEntity;
import com.ebi.kayanProject.model.ServicesDto;
import com.ebi.kayanProject.repo.ServicesRepoInt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesService implements ServicesServiceInt {
    private final ServicesRepoInt servicesRepoInt;
    private final ModelMapper modelMapper=new ModelMapper();
    public ServicesService(ServicesRepoInt servicesRepoInt) {
        this.servicesRepoInt=servicesRepoInt;
    }


    @Override
    public ServicesDto getServiceById(Long id) {
        return modelMapper.map(servicesRepoInt.findById(id).get(),ServicesDto.class);
    }

    @Override
    public List<ServicesDto> getAllServices() {
        List<ServicesEntity> servicesEntities =servicesRepoInt.findAll();
        return servicesEntities.stream().map(servicesRepoInt1 -> modelMapper.map(servicesRepoInt1,ServicesDto.class)).collect(Collectors.toList());
    }
}
