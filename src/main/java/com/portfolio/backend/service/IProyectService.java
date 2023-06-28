/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyect;
import java.util.List;
/**
 *
 * @author admin
 */
public interface IProyectService {
 
    public List<Proyect> getProyect();
    
    public void addProyect (Proyect pro);
    
    public void deleteProyect (Long id);
    
    public List<Proyect> getProyectByUserId (Long id);  
}
