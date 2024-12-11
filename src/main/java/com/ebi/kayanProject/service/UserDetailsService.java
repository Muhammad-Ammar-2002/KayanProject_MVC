//package com.ebi.kayanProject.service;
//import com.ebi.kayanProject.entity.UserPrincipleEntity;
//import com.ebi.kayanProject.entity.UserEntity;
//import com.ebi.kayanProject.repo.UserRepoInt;
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@AllArgsConstructor
//@Service
//public class UserDetailsService implements UserDetailsService {
//
//    private  final UserRepoInt userRepoInt;
//
//
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        UserEntity user=userRepoInt.findByEmail(username);
//        if(user==null){
//            throw new UsernameNotFoundException("user :"+username+" not found");
//        }
//
//
//
//        return new UserPrincipleEntity(user);
//    }
//}
