package codalityPractice;

import java.util.Scanner;

public class Codality3 {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=new String();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
			 s1=s.substring(i, i+1);
				System.out.println(s1);
				
		}
		}

	}
}
