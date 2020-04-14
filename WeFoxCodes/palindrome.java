package WeFoxCodes;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word=scan.nextLine();
		word=word.toLowerCase().replace(" ", "");
		String reverse="";
		
		for(int i=word.length()-1;i>=0;i--) {
			reverse+= word.charAt(i);
		}
			System.out.println(reverse);
			if(word.equalsIgnoreCase(reverse)) {
				System.out.println("Palindrome");
			}else {
				System.out.println(" Not palindrome");
			}
			
		
			
			scan.close();
		}
	}


