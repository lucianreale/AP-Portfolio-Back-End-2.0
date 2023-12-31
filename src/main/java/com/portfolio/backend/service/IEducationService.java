/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Education;
import java.util.List;
/**
 *
 * @author porce
 */
public interface IEducationService {
    
    public List<Education> getEducation();
    
    public void addEducation (Education edu);
    
    public void deleteEducation (Long id);
    
    public List<Education> getEducationByUserId (Long id);    
}
