/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyect;
import com.portfolio.backend.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author admin
 */
@Service
public class ProyectService implements IProyectService{
    
    @Autowired
    public ProyectRepository proRepo;
    
    @Override
    public List<Proyect> getProyect() {
        return proRepo.findAll();
    }

    @Override
    public void addProyect(Proyect pro) {
       proRepo.save(pro);
    }

    @Override
    public void deleteProyect(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public List<Proyect> getProyectByUserId(Long user_id) {
        return proRepo.findByUserid(user_id);
    }
}