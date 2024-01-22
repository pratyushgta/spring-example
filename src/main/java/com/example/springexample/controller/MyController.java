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
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping("/display")
    String display() {
        return "God is Great!!";
    }

    // MSA-E1-Q1
    @Autowired
    Employee ob1;

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

    // MSA-E1-Q2 NOT WORKING
    @Autowired
    Employee ob2;

    @PostMapping("/details2")
    public String initEmployee(@RequestBody Employee employee) {
        this.ob2 = employee;
        return "Object2 initialised!";
    }

    // MSA-E1-Q3
    @Autowired
    Employee ob3;

    @RequestMapping("/details3")
    String employee_details3() {
        ob3.setId(103);
        ob3.setName("Mr Bean");
        return "<h4 style=\"font-family:verdana; color:lightcoral;\"> Employee details: " + ob3;
    }

    // MSA-E1-Q4
    @Autowired
    Employee ob4;

    @RequestMapping("/details4")
    String employee_details4() {
        ob4.setId(104);
        ob4.setName("Mr Bean");
        return "<h4 style=\"font-family:verdana; color:navy;\"> Employee details: " + ob4;
    }

    // MSA-E1-Q5
    Employee ob5 = new Employee();

    @RequestMapping("/details5")
    String employee_details5() {
        ob5.setId(105);
        ob5.setName("Mr Bean");

        Address address = new Address();
        address.setCity("Mumbai");
        address.setState("MH");
        address.setPin(400076);
        ob5.setAddress(address);

        System.out.println(ob5);
        return "<h4 style=\"font-family:verdana; color:darkgoldenrod;\"> Employee details: " + ob5;
    }

    //http://localhost:6363/details6/106/Penguin/Appleland/World/1134
    @Autowired
    Employee ob6;
    @GetMapping("/details6/{empid}/{name}/{city}/{state}/{pin}")
    String employee_details6(@PathVariable("empid") int id,
                             @PathVariable("name") String name,
                             @PathVariable("city") String city,
                             @PathVariable("state") String state,
                             @PathVariable("pin") long pin) {
        ob6.setName(name);
        ob6.setId(id);
        Address address = new Address();
        address.setCity(city);
        address.setState(state);
        address.setPin(pin);
        ob6.setAddress(address);

        return "<h4 style=\"font-family:verdana; color:darkgoldenrod;\"> Employee details 6: " + ob6;

    }

    //http://localhost:6363/details7/query?id=107&name=Pengu&city=Bananaland&state=Mars&pin=6363
    @Autowired
    Employee ob7;
    @GetMapping("/details7/query")
    String employee_details7(@RequestParam int id,
                             @RequestParam String name,
                             @RequestParam String city,
                             @RequestParam String state,
                             @RequestParam long pin){
        ob7.setName(name);
        ob7.setId(id);
        Address address = new Address();
        address.setCity(city);
        address.setState(state);
        address.setPin(pin);
        ob7.setAddress(address);

        return "<h4 style=\"font-family:verdana; color:darkgoldenrod;\"> Employee details 7: " + ob7;
    }

}