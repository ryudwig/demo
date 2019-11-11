package com.widerplanet.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue
    private Long teamId;
    private String name;
    private String region;

    public Team(String name, String region){
        this.name = name;
        this.region = region;
    }
}
