package com.Test.JavaDemo;

// Check the number is prime or not
public class Exer1 {

	public static void main(String[] args) {
		int a = 19; 
		int c=0;
		for(int i=1; i<(a/2); i++) {
			if(a%i == 0) {
				c++;
			}
		}
		if(c==1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not");
		}

	}

}
