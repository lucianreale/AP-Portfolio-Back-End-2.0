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
public class Experience {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Long userid;
    private String position;
    private String company;
    private String img;
    private String description;
    private String start;
    private String end;
    
    public Experience (){
    };
    
    public Experience ( Long id,
                        Long userid,
                        String position,
                        String company,
                        String img,
                        String description,
                        String start,
                        String end){
           
            this.id = id;
            this.userid = userid;
            this.position = position;
            this.company = company;
            this.img = img;
            this.description = description;
            this.start = start;
            this.end = end;
    }
}
