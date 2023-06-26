/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Education;
import com.portfolio.backend.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author porce
 */
@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository eduRepo;
    
    @Override
    public List<Education> getEducation() {
        return eduRepo.findAll();
    }

    @Override
    public void addEducation(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEducation(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public List<Education> getEducationByUserId(Long user_id) {
        return eduRepo.findByUserid(user_id);
    }
}
