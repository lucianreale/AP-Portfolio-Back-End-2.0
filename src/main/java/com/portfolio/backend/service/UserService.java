/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.User;
import com.portfolio.backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author porce
 */
@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository usuRepo;
    
    @Override
    public List<User> getUser() {
        return usuRepo.findAll();
    }

    @Override
    public void addUser(User usu) {
        usuRepo.save(usu);
        
    }

    @Override
    public void deleteUser(Long id) {
        usuRepo.deleteById(id);
        
    }
    
     @Override
    public User getUserByid(Long id) {
        return usuRepo.findById(id).orElse(null);
        
    }
    
    @Override
    public User getUserByMail(String mail) {
        return usuRepo.findOneByMail(mail).orElse(null);
        
    }
}
