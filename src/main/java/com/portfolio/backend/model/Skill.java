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
 * @author porce
 */
@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Long userid;
    private String name;
    private Integer skill;
    private String rating;
    
    public Skill (){
    };
    
    public Skill (Long id,
                Long userid,
                String name,
                Integer skill,
                String rating){      
            
            this.id = id;
            this.userid = userid;
            this.name = name;
            this.skill = skill;
            this.rating = rating;
    }
}    
