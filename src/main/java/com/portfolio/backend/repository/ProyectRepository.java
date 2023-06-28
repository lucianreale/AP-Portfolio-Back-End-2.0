/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Proyect;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author admin
 */

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Long>{
    
    List<Proyect> findByUserid (Long id);
}
