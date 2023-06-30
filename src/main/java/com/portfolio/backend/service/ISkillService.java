/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import java.util.List;
/**
 *
 * @author porce
 */
public interface ISkillService {
    
    public List<Skill> getSkill();
    
    public void addSkill (Skill skill);
    
    public void deleteSkill (Long id);
    
    public List<Skill> getSkillByUserId (Long id);   
}
