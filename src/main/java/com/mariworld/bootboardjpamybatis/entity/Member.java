package com.mariworld.bootboardjpamybatis.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member extends BaseEntity{

    @Id
    private String email;
    private String password;
    private String name;
}
