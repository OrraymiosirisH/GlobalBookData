package globalbookdatabase;

import java.util.Scanner;

public class Book {

	private static Scanner input = new Scanner(System.in);
	
	
	
	public Book() {

		double[] myPrice = new double[100];
		String[] myDesc = new String[100];
		String[] myTitle = new String[100];
		String[] myAuthor = new String[100];
		String[] mySku = new String[100];
		int rex=0;
		String lex;
		int i=0;
		
		do { 
				
					
					System.out.print("Book #" + (i) + "-SKU:");
					mySku[i] = input.nextLine();

					System.out.print("Title:");
					myTitle[i] = input.nextLine();

					System.out.print("Author:");
					myAuthor[i] = input.nextLine();

					System.out.print("Description:");
					myDesc[i] = input.nextLine();

					System.out.print("price:US$");
					myPrice[i] = input.nextDouble();
					input.nextLine();
			
				i++;
						
			
			System.out.println("\n" + "\n" + "Would you like continue Entry a New Book, press [yes] or [no]");
			lex = input.nextLine();
		} while (lex.equalsIgnoreCase("yes")); // while close

	

	      }
		 
		
		
	}
	
	
//	 // Print all the array elements
//    for (double element: myPrice) {
	//    System.out.println(element);