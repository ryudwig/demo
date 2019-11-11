package com.widerplanet.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@ToString(exclude = "team")
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String addr;
    @ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public Member(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
}
