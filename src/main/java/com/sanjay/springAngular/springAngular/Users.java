package com.sanjay.springAngular.springAngular;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long myid;

    private String name;

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    @Override
    public String toString() {
        return "Users{" +
                "myid=" + myid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    // standard constructors / setters / getters / toString
}