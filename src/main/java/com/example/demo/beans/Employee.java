package com.example.demo.beans;

import com.example.demo.Fonction;
import lombok.Data;

@Data
public class Employee {

    private String name;
    private String addess;
    private String email;
    private String phone;
    private Fonction fonction;

    public Employee(String name, String email, String phone, String address, Fonction fonction) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.addess = address;
        this.fonction = fonction;
    }
}
