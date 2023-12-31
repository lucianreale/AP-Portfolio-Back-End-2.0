/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import java.util.List;
import com.portfolio.backend.model.Education;
import com.portfolio.backend.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService eduSrv;
    

    @GetMapping ("/education")
    @ResponseBody
    public List<Education> getEducation() {
        return eduSrv.getEducation();
    }
    
    @PostMapping ("/education/add")
    public void addEducation(@RequestBody Education edu){
         eduSrv.addEducation(edu);
    }
    
    @DeleteMapping("/education/del/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduSrv.deleteEducation(id);
    }
    
    @PutMapping ("/education/update")
    public void updateUser(@RequestBody Education edu){
         eduSrv.addEducation(edu);
    }
    
    @GetMapping ("/education/getbyuserid/{id}")
    @ResponseBody
    public List<Education> getEducationByUserid(@PathVariable Long id) {
        return eduSrv.getEducationByUserId(id);
    }
}
