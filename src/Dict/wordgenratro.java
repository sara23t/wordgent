package Dict;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class wordgenratro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
			

		String filname = "/Users/Downloads/tds.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filname, true));

		boolean x = false;
		 while (!x) {

		
			System.out.println("name?");
			String name = sc.nextLine();

			System.out.println();
			writer.write(name);
            writer.newLine();
			System.out.println("book count");


			int fs1 = sc.nextInt();
			writer.write(fs1);
            writer.newLine();
            
			System.out.println("email");
			String email = sc.next();
			
		
			writer.write(email);
			writer.newLine();
			
			if ("exit".equalsIgnoreCase(email.trim())) {
                System.out.println("Exiting the program.");
     
                break;
            }
			x = true;
        }

		
		writer.close();
		System.out.println();
        System.out.println("User input saved to " + filname);
		
		} catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the scanner to prevent resource leaks
            sc.close();
        }

	}

	public static int bookprice(int num) {

		int bookprice = 45;

		int price = bookprice * num;

		return price;
	}
	
	

}
