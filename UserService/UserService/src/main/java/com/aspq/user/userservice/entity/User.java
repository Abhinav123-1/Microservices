package com.aspq.user.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id")
    private String userID;
    @Column(name="username")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="about")
    private String about;
}
