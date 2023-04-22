package com.nr.springbootcrudexample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;

}
