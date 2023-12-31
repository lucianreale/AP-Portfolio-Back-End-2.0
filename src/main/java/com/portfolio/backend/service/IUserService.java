/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;
import java.util.List;

import com.portfolio.backend.model.User;

/**
 *
 * @author porce
 */
public interface IUserService {
    public List<User> getUser();
    
    public void addUser (User usu);
    
    public void deleteUser (Long id);
    
    public User getUserByid (Long id);
    
    public User getUserByMail (String mail);
}
