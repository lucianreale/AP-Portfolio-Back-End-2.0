/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author porce
 */
@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> getSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void addSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public List<Skill> getSkillByUserId(Long user_id) {
        return skillRepo.findByUserid(user_id);
    }
}
