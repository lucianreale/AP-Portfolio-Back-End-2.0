/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Experience;
import java.util.List;
/**
 *
 * @author admin
 */
public interface IExperienceService {
    
    public List<Experience> getExperience();
    
    public void addExperience (Experience edu);
    
    public void deleteExperience (Long id);
    
    public List<Experience> getExperienceByUserId (Long id);  
}
