/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author admin
 */

@Getter @Setter
@Entity
public class Proyect {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Long userid;
    private String company;
    private String name;
    private String start;
    private String end;
    private String url;      
            
    public Proyect (){
    };
    
    public Proyect (Long id,
                Long userid,
                String company,
                String name,
                String start,
                String end,
                String url){      
            
            this.id = id;
            this.userid = userid;
            this.company = company;
            this.name = name;
            this.start = start;
            this.end = end;
            this.url = url;
    }
}    