package com.upskill.java_2;

public class Loops {
/*
    Type of Loops
      1. For loop
      2. While Loop
      3. Do While Loop
      4. Infinite Loop
 */
 public static void main(String[] args) {
		//practiceforLoop();
		//practiceWhileLoop();
		//practiceDoWhile();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
		
		
		}

	public static void practiceforLoop() {                      //For Loop - Do again and again upto upper limit
		int i;                                                  // Initialize the variable
		for(i = 1; i<=10000; i++){                              // Setting lower limit, upper limit, Increment or Decrement
			System.out.println("For Loops number = " + i);      // Statement
		}
	}
    
	public static void practiceWhileLoop(){                       //While Loop - Do again and gain condition match
	int i = 1;                                                   //Initialize the variable
	while(i<=10){                                                //Setting Condition
		System.out.println("While Loops  number = " + i);       // Statement
		i++;                                                    //Increment or Decrement
		}
  }
    	 
 public static void practiceDoWhile(){                          //statement
	 int i = 1;                                                 //Initialize the variable
	 do{
		 System.out.println("Do While Loops number = " + i);    //statement
		 i++;                                                   //Increment or Decrement
	 } while (i<=100);                                          // Checking condition
 }

public static void practiceInfiniteLoop(){                      //Infinite Loop - never ending loop
	int i;                                                      //Initialize the variable
	for (i=1; ; i++){                                           //Setting no upper limit
		System.out.println("Infinite Loops number = " + 1);     // Statement
	   }
    }

   public static void practiceNestedForLoop(){                  //Nested Loop - Loop inside another loop
	   int i;                                                   //Initialize i for loop 1
	   int j;                                                   //Initialize j for loop 1
	   for (i=1; i<=10; i++){                                   //First loop for i
		   for (j=1; j<=10; j++){                               //First loop for i
			   int multipicationTable = i * j;                  //Statement for loop 2
			   System.out.print(multipicationTable + " ");
		   }
		   System.out.println(" ");                             //Statement for loop 1
	   }
		   }
	   }
   
