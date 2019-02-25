package com.example.employeeTracking.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="employees")

public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @Column(name="name")
    String name;

    @Column(name="age")
    int age;

    @Column(name="employee_number")
    int employeeNumber;

    @Column(name="email")
    String email;


    public Employee(String name, int age, int employeeNumber, String email){
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;

    }


    public Employee(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
