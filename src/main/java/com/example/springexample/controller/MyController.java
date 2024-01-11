/**
 * This class contains methods for implementing controller for SpringBoot Application
 * MSA-E1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.example.springexample.controller;

import com.example.springexample.entity.Address;
import com.example.springexample.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/display")
    String display() {
        return "God is Great!!";
    }

    // MSA-E1-Q1
    Employee ob1 = new Employee();

    @RequestMapping("/details1")
    String employee_details1() {
        ob1.setId(101);
        ob1.setName("Mr Bean");

        Address address = new Address();
        address.setCity("Mumbai");
        address.setState("MH");
        address.setPin(400076);
        ob1.setAddress(address);
        return "<h4 style=\"font-family:verdana; color:teal;\"> Employee details: " + ob1;
    }

    // MSA-E1-Q2
    @Autowired
    Employee ob2;

    @RequestMapping("/details2")
    String employee_details() {
        ob2.setId(101);
        ob2.setName("Mr Bean");

        Address address = new Address();
        address.setCity("Mumbai");
        address.setState("MH");
        address.setPin(400076);
        ob2.setAddress(address);
        return "<h4 style=\"font-family:verdana; color:lightcoral;\"> Employee details: " + ob2;
    }

    // MSA-E1-Q3
    @Autowired
    Employee ob3;

    @RequestMapping("/details3")
    String employee_details3() {
        ob3.setId(101);
        ob3.setName("Mr Bean");
        return "<h4 style=\"font-family:verdana; color:teal;\"> Employee details: " + ob3;
    }
}