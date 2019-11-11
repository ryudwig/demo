package com.widerplanet.demo;

import com.widerplanet.demo.entity.Member;
import com.widerplanet.demo.entity.Team;
import com.widerplanet.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
    @Autowired
    private MemberRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Member member1 = new Member("ryu", "Seoul");
        Team team1 = new Team("Tigers", "Seoul");
        member1.setTeam(team1);
        repository.save(member1);

        Member member2 = new Member("lee", "Seoul");
        Team team2 = new Team("Dolphins", "Jeju");
        member2.setTeam(team2);
        repository.save(member2);

        repository.flush();

        Optional<Member> oneMember = repository.findById(1L);
        System.out.println(oneMember);

    }
}
