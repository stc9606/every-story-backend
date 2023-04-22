package com.story.entity;

import lombok.Getter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id
    private String email;
    private String password;
    private String name;
    private String nickName;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Board> board = new ArrayList<>();
}
