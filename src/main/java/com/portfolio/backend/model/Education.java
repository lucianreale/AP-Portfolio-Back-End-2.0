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
public class Education {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Long userid;
    private String school;
    private String title;
    private String img;
    private String career;
    private Integer score;
    private Integer start;
    private Integer end;
    
    public Education (){
    };
    
    public Education (  Long id,
                        Long userid,
                        String school,
                        String title,
                        String img,
                        String career,
                        Integer score,
                        Integer start,
                        Integer end){
           
            this.id = id;
            this.userid = userid;
            this.school = school;
            this.title = title;
            this.img = img;
            this.career = career;
            this.score = score;
            this.start = start;
            this.end = end;
    }
}