/**
 * This class contains methods for creating Address class to use in dependency injection
 * MSA-E1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.example.springexample.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    // @Value part of MSA-E1-Q3
    @Value("${address.pin}")
    long pin;
    @Value("${address.city}")
    String city;
    @Value("${address.state}")
    String state;


    @Override
    public String toString() {
        return "Address{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
