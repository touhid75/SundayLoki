package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 101;
		
		if(age <= 13 ){
			System.out.println ("You are childern");
		} else if (age > 13 && age <18){
			System.out.println("You are Teenager");
		} else if (age>=60){
			if (age < 100){
			System.out.println("You are senior");
			} else 
			 System.out.println("You are cahmpion");
			} else {
			System.out.println("You are adult");
			
			
		}

	}

}
