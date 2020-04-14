package WeFoxCodes;

import java.util.Random;

public class randomCode {

	public static void main(String[] args) {
		Random rn=new Random();
		int smallNumber = Integer.MAX_VALUE;
        for(int i = 0; i<=500; i++){
       // int n = (int) (Math.random()*1000);
        	int n=rn.nextInt(1000);
        System.out.println("n "+i+": "+n);
        if(smallNumber>n){ 
        	smallNumber=n;
        }
	}

	}}
