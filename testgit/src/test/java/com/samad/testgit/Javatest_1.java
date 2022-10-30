package com.samad.testgit;

public class Javatest_1 {

	public static void main(String[] args) {
		
		//Reverse a string___1
		
				String str = "abcdefg";
				String str1=str.toUpperCase();
				char str1Array[]= str1.toCharArray();
				System.out.println("1: "+str1);
				System.out.print("2: ");
				for (int i=str1.length()-1; i>=0; i-- ) {
					System.out.print(str1Array[i]);
				}
				//Reverse a string___2
				StringBuilder str2= new StringBuilder();
				str2.append(str1Array);
				str2=str2.reverse();
				System.out.print("\n"+ "3: "+str2);

	}

}
