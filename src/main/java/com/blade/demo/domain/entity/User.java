package com.blade.demo.domain.entity;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Table;

@Table
public class User extends Model {

    private Integer id;
    private String username;
    private String password;
    private String realName;
    private Integer age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", realName='" + getRealName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

}
