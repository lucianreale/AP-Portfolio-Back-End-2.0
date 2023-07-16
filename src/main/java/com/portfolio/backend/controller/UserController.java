/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;
import java.util.List;

import com.portfolio.backend.model.User;
import com.portfolio.backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author porce
 */
@CrossOrigin(origins = "*")
@RestController
public class UserController {
    
    //List<User> listaLogin = new ArrayList();
    
    @Autowired
    private IUserService usuSrv;
    
    @GetMapping ("/test")
    public String test(){
         return "Hola, el BackEnd se encuentra Online CORS 5";
    }
    
    @GetMapping ("/user/getbyid/{id}")
    @ResponseBody
    public User getUserByid(@PathVariable Long id){
        return usuSrv.getUserByid(id);
    }
    
    @GetMapping ("/user/getbymail/{mail}")
    @ResponseBody
    public User getUserByMail(@PathVariable String mail){
        return usuSrv.getUserByMail(mail);
    }
    
    @GetMapping ("/user")
    @ResponseBody
    public List<User> getUser() {
        List<User> tmpUser;
        tmpUser = usuSrv.getUser();
        
        for (User User : tmpUser) {
            User.setPass("Ah, Ah, Ah!!!");
            //System.out.println(User.getPass());
        }   
        return tmpUser;
    }
    
    
    @DeleteMapping("/user/del/{id}")
    public void deleteUser(@PathVariable Long id){
        usuSrv.deleteUser(id);
    }
    

    @PostMapping ("/user/add")
    public void addUser(@RequestBody User usu){
        User tmpUser;
        tmpUser = usuSrv.getUserByMail(usu.getMail());
        
        if (tmpUser == null) {
            System.out.println("correo Inexistente, se procede al alta");
            usuSrv.addUser(usu);
        }    
    }
    
    @PostMapping ("/login")
    public User login(@RequestBody User usu){
        User tmpUser;
        tmpUser = usuSrv.getUserByMail(usu.getMail());
        
        if (tmpUser != null) {
            if (!tmpUser.getPass().toLowerCase().equals(usu.getPass().toLowerCase())){
                    tmpUser = null;
            } else {
                tmpUser.setPass("Ah, Ah, Ah!!!");
            }
        }         
        return tmpUser;
    }

    @PutMapping ("/user/update")
    public void updateUser(@RequestBody User usu){
        usuSrv.addUser(usu);
    }
}
