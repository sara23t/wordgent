package Dict;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class wordDic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String wrd = sc.nextLine();
		int wr = sc.nextInt();
		genword(wrd, wr);

	}

	public static void genword(String word, int num) {
		
	for (int wordnum = 1; wordnum <= num; wordnum++) {
		
		int count = 0;
		
		char[] ch = new char[word.length()];
			
		for(int i = 0; i < word.length(); i++) {
			
			ch[i] = word.charAt(i);
			
			
		}
		
		 List<Character> randomWordsList = new ArrayList<>();
		
		 for (char c : ch) {
			
			 randomWordsList.add(c);
	
            
        }
		 
	     
		 Collections.shuffle(randomWordsList);
		 
		
		 StringBuilder randomWord = new StringBuilder();
	    
		 for (char c : randomWordsList) {
	            randomWord.append(c);
	        }
	        
	        System.out.println(randomWord.toString());

	        
		 
     }
	
	
	}
	    		   
	    		   
	}

