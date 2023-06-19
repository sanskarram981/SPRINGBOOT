package com.spring.springboot.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Column;


@Entity
@Table(name="user_details")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id")
    private int id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_status")
    private String status;
    @Column(name="student_city")
    private String city;

    public User()
    {
        super();
    }

    public User(String name,String city,String status)
    {
        super();
        this.name = name;
        this.status = status;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "["+"id : "+this.id+","+"name : "+this.name+","+"city : "+this.city+","+"status : "+this.status+"]";
    }

}


