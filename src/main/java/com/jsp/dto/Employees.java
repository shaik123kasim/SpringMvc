package com.jsp.dto;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
    @Id
    private int id;
    private  String name;
    private long phone;

    public Employees(){

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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
