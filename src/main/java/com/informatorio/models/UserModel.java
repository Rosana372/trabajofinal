package com.informatorio.models;

public class UserModel {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String city;
    private String province;
    private String country;

    public Long getId(){
        return id;
    }

    public void getId(Long id){
        this.id = id;
    }

    public String setName(){
        return name;

    }

    public void setName(String Name){
        this.name=name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;

    }

    
    
}
