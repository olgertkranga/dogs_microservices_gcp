package com.example.dogs;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Dog {
 
	
@Id private Long id;	
private String name;
 private int age;
 
 
 
 
 public Dog(String string, int i) {
		// TODO Auto-generated constructor stub
	}
 
 
 
 
}