package codalityPractice;

import java.util.Scanner;

public class Codality2 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	 int a[]=new int[26];
	 for(int i=0;i<s.length();i++) {
		int ch=s.charAt(i)-'a';
		a[ch]++;		 
	 }
	 int count=0;
	 for(int i=0;i<26;i++) {
		 if(a[i]%2!=0) {
			 count++;
		 }
	 }
	 System.out.println(count);
	}
}
