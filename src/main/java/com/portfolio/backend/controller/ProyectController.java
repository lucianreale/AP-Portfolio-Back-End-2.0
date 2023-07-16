/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import java.util.List;
import com.portfolio.backend.model.Proyect;
import com.portfolio.backend.service.IProyectService;
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
public class ProyectController {
    
    @Autowired
    private IProyectService proSrv;
    

    @GetMapping ("/proyect")
    @ResponseBody
    public List<Proyect> getProyect() {
        return proSrv.getProyect();
    }
    
    @PostMapping ("/proyect/add")
    public void addProyect(@RequestBody Proyect pro){
         proSrv.addProyect(pro);
    }
    
    @DeleteMapping("/proyect/del/{id}")
    public void deleteProyect(@PathVariable Long id){
        proSrv.deleteProyect(id);
    }
    
    @PutMapping ("/proyect/update")
    public void updateProyect(@RequestBody Proyect exp){
         proSrv.addProyect(exp);
    }
    
    @GetMapping ("/proyect/getbyuserid/{id}")
    @ResponseBody
    public List<Proyect> getProyectByUserid(@PathVariable Long id) {
        return proSrv.getProyectByUserId(id);
    }
}

