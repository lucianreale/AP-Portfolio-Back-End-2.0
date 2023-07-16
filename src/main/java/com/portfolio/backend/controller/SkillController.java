/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import java.util.List;
import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService skillSrv;
    

    @GetMapping ("/skill")
    @ResponseBody
    public List<Skill> getSkill() {
        return skillSrv.getSkill();
    }
    
    @PostMapping ("/skill/add")
    public void addEducation(@RequestBody Skill skill){
         skillSrv.addSkill(skill);
    }
    
    @DeleteMapping("/skill/del/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillSrv.deleteSkill(id);
    }
    
    @PutMapping ("/skill/update")
    public void updateUser(@RequestBody Skill skill){
         skillSrv.addSkill(skill);
    }
    
    @GetMapping ("/skill/getbyuserid/{id}")
    @ResponseBody
    public List<Skill> getSkillByUserid(@PathVariable Long id) {
        return skillSrv.getSkillByUserId(id);
    }
}