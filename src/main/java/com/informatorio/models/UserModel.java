package com.informatorio.models;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
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

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name=name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;

    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;

    }


    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;

    }

    public String getProvince(){
        return province;
    }

    public void setProvince(String province){
        this.province=province;

    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;

    }





    
    
}
