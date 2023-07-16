/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import java.util.List;
import com.portfolio.backend.model.Experience;
import com.portfolio.backend.service.IExperienceService;
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
 * @author admin
 */
@CrossOrigin(origins = "*")
@RestController
public class ExperienceController {
    
    @Autowired
    private IExperienceService expSrv;
    

    @GetMapping ("/experience")
    @ResponseBody
    public List<Experience> getExperience() {
        return expSrv.getExperience();
    }
    
    @PostMapping ("/experience/add")
    public void addExperience(@RequestBody Experience exp){
         expSrv.addExperience(exp);
    }
    
    @DeleteMapping("/experience/del/{id}")
    public void deleteExperience(@PathVariable Long id){
        expSrv.deleteExperience(id);
    }
    
    @PutMapping ("/experience/update")
    public void updateExperience(@RequestBody Experience exp){
         expSrv.addExperience(exp);
    }
    
    @GetMapping ("/experience/getbyuserid/{id}")
    @ResponseBody
    public List<Experience> getExperienceByUserid(@PathVariable Long id) {
        return expSrv.getExperienceByUserId(id);
    }
}

