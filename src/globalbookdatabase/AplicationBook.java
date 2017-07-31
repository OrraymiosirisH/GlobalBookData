package globalbookdatabase;

import java.util.Scanner;

import bookdatabase.DataBase;

public class AplicationBook {


private static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) 	{
		// TODO Auto-generated method stub

	
	
			System.out.println(
					".......................................WELCOME TO Global Library.............................................."
							+ " \n ");

			System.out.println("\n" + "Please Choose [1] or [2]." + "\n");
			System.out.println(" \t " + "[1] Create a New Entry.");
			System.out.print(" \t " + "[2] Search for Books.");
			int nivel = input.nextInt();
		
			if (nivel == 1) {
			
			
				Book B = new Book();	
				
					
			}
			

	}
	
	
	public static void levelChoice(String P) {

		System.out.println(P);

	}

}
	
	
		
		
	}


