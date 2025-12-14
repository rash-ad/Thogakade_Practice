package model;

import javax.swing.*;

public class Customer {
    private String id;
    private  String name;
    private String email;
    private double salary;
    private String address;

public Customer(String id,String name,String email,double salary,String address){
    this.id=id;
    this.name=name;
    this.email=email;
    this.salary=salary;
    this.address=address;


}
    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
