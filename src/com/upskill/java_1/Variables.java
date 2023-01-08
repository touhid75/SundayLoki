package com.upskill.java_1;

public class Variables {
	
// Variables in Java
	
	public String country = "USA";                //Instance OR global variable - Variables declared in class level, outside method
			
	public String country2 = "Russia";
	
	public static String region = "America";      // Static variable - variables belong to class and do not creating object
	
	public static void main(String[] args) {
		
		String city = "New York";                 // Local variable - variable declared in methods 
		
		method("Essex");
		
  }
	
	public static void method(String county){   // Method parameter - variables used as method
		
		String city = "Bloomfield";
		
		String myCounty = county;
	
	}
		
	public void test(){
		
	}
}
