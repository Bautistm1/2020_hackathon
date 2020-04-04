import java.util.*; 
import java.lang.*; 
/*
 * HackathonProject.java
 * Maribel Bautista Tena
 * 4/4/2020
 */

public class HackathonProject {
	
	//static variables
	private static int lives = 5;
	private static int correct = 0; 
	
	//static methods
	public static int getLives () { return lives; }

	public static void message() {
		System.out.println("Welcome to Telos!\n");
		
		System.out.println("Telos is a crystal city located inside "
				+ "Mt.Shasta which is now the home to The Lemurians. \n");
		
	}//message method
	
	public static void mission() {
		System.out.println("Your mission, should you choose to accept, "
				+ "is to navigate Mt.Shasta to discover Telos and "
				+ "possibly become a lemurian legend yourself. \n");
		
		System.out.println("Do you accept this mission?\n");

		System.out.println("1. Yes.");
		System.out.println("2. No.");

		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			try {
				int answer = Integer.parseInt(input.nextLine());
				System.out.println("You chose " + answer);
					
				if(answer != 1){
					System.out.println("See ya bye!");
					System.exit(0);
				}//if
				else{
					System.out.println("Great :) please proceed to the entry "
							+ "question. \n"
							+ "You will only have 5 lives, proceed with caution. \n");
				}//else
				i++;
			}//try
			catch (NumberFormatException e) {
				System.out.println("Input is not a valid integer, please try again.");
				i--;
			}//catch
		}//for
			
	}//mission method
	
	private static void question1() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("In order to gain entry into Mt.Shasta,"
					+ " you must first answer a question about the city. \n");
		
			System.out.println("What is the elevation in ft of Mt.Shasta? \n");
			System.out.println("1. 10,000,000 ft");
			System.out.println("2. 23,000 ft");
			System.out.println("3. 14,179 ft");
			System.out.println("4. 14,432 ft");
			System.out.print("Enter choice (1-4): ");
			
			Scanner input = new Scanner(System.in);
			
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");

				    if(choice != 3) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 3. 17,179 ft. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "You may now enter the city of Mt.Shasta!! \n");
				    	correct = correct + 1;
				    }//else
				    i++; 
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
		
	}// question1 method
	
	private static void question2() {
		
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("What state is Mt.Shasta located in? \n");
			System.out.println("1. Oklahoma");
			System.out.println("2. Oregon");
			System.out.println("3. Shasta");
			System.out.println("4. California");
			System.out.println("5. Nevada");
			System.out.print("Enter choice (1-5): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
				    
				    if(choice != 4) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 4. Califorina. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
				    i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question2 method
	
	private static void question3() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("What is the name of the Ski resort located in Mt.Shasta? \n");
			System.out.println("1. Mt. Shasta Nordic Center");
			System.out.println("2. Lemurians Ski Resort");
			System.out.println("3. Mt.Shasta Shredders Resort");
			System.out.println("4. Telos Ski Resort");
			System.out.println("5. Mt.Shasta Ski Area");
			System.out.print("Enter choice (1-5): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
				    
				    if(choice != 1) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 1. Mt. Shasta Nordic Center. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
				    i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question3 method
	
	private static void question4() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("How many named glaciers does Mt.Shasta have? \n");
			System.out.println("1. 5");
			System.out.println("2. 13");
			System.out.println("3. 24");
			System.out.println("4. 69");
			System.out.println("5. 7");
			System.out.print("Enter choice (1-5): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
				    
				    if(choice != 5) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 5. 7. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
				    i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question4 method
	
	private static void question5() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("True or False: Many believe that Lemurians"
					+ " are 15ft tall beings with 4 arms that later evolved"
					+ " into actual lemurs? \n");
			System.out.println("(If this question is answered correctly,"
					+ " you will get 1 life added to your total. \n");
			System.out.println("1. True");
			System.out.println("2. False");
			System.out.print("Enter choice (1-2): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
					
					if(choice != 1) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 1. True. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    	lives = lives + 1; 
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//else
					i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question5 method
	
	private static void question6() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("True or False: Mt. Shasta is not a volcano? \n");
			System.out.println("1. True");
			System.out.println("2. False");
			System.out.print("Enter choice (1-2): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
					
					if(choice != 2) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 2. False. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
					i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question6
	
	private static void question7() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("True or False: King Julien the lemur from Penguins of "
					+ "Madagascar is a Lemurian? \n");
			System.out.println("1. False");
			System.out.println("2. True");
			System.out.print("Enter choice (1-2): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++){
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
					
					if(choice != 1) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 1. False. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
					i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question7
	
	private static void question8() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("When was the last time Mt.Shasta erupted? \n");
			System.out.println("1. 2019");
			System.out.println("2. 1225 AD");
			System.out.println("3. 2000 BC");
			System.out.println("4. 1250 AD ");
			System.out.println("5. 2012");
			System.out.println("Enter choice (1-5): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
					
					if(choice != 4) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 4. 1250 AD. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "Proceed to the next question. \n");
				    	correct = correct + 1;
				    }//else
					i++; 
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question8
	
	private static void question9() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("Lemuria is a mythical lost land similar to: \n");
			System.out.println("1. Ashlandia");
			System.out.println("2. Atlantis");
			System.out.println("3. Scandia");
			System.out.println("4. Portlandia");
			System.out.println("5. Asgard");
			System.out.println("Enter choice (1-5): ");
			
			Scanner input = new Scanner(System.in);
		   
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
					System.out.println("You chose " + choice + "\n");
						
					if(choice != 2) {
					    System.out.println("You chose the wrong answer :( \n"
					    		+ "You will now lose one life. \n");
					    lives = lives - 1;
					    
					    System.out.println("The correct answer is: 2. Atlantis. \n");
					    
					    System.out.println("You now have: "+getLives()+ " lives. \n");
					 }//if
					 else {
					    System.out.println("CORRECT! \n"
					    		+ "Proceed to the next question. \n");
					    correct = correct + 1;
					 }//else
					 i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question9
	
	private static void question10() {
		if(lives <= 0) {
			System.out.println("YOU DIED :(");
			System.exit(0);
		}//if
		else {
			System.out.println("True or False: Shasta Networks, located"
					+ " in Oregon, owns the Mt.Shasta Ski Park? \n"); 
			System.out.println("1. True");
			System.out.println("2. False");
			System.out.print("Enter choice (1-2): ");
			
			Scanner input = new Scanner(System.in);
		    
			for(int i = 0; i < 2; i++) {
				try {
					int choice = Integer.parseInt(input.nextLine());
				    System.out.println("You chose " + choice + "\n");
					
					if(choice != 2) {
				    	System.out.println("You chose the wrong answer :( \n"
				    			+ "You will now lose one life. \n");
				    	lives = lives - 1; 
				    	
				    	System.out.println("The correct answer is: 2. False. \n");
				    	
				    	System.out.println("You now have: "+getLives()+ " lives. \n");
				    }//if
				    else {
				    	System.out.println("CORRECT! \n"
				    			+ "You have reached the end of the game! \n");
				    	correct = correct + 1;
				    }//else
					i++;
				}//try
				catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer, please try again.");
					i--;
				}//catch
			}//for
		}//else
	}//question10 method
	
	public static void main (String [] args) {
		System.out.println("Please enter your name: \n");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.println("Hello " + name + "! \n");
		
		message();
		mission();
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		
		System.out.println("Your number of correct answers is: " +correct + "\n");
		if(correct == 10) {
			System.out.println("You answered all of the questions correctly. \n"
					+ "CONGRATULATIONS: YOU ARE NOW A LEMURIAN LEGEND! \n");
		}//if
		
	}//main
}//HackathonProject