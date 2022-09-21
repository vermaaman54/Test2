package codalityPractice;

import java.util.Scanner;

public class Codalitu1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	 int a[]=new int[26];
	 for(int i=0;i<s.length();i++) {
		int ch=s.charAt(i)-'a';
		a[ch]++;
		 
	 }
	 /* for(int c:a) {
		 System.out.print(c+" ");
	 }*/
	 String s1="";
	 int count=0;
	 for(int i=0;i<26;i++) {
		 if(a[i]==1) {
			 s1+=(char)(i+'a');
			 count++;
		 }
	 }
	 System.out.println(count+" "+s1);
		
	}
}
