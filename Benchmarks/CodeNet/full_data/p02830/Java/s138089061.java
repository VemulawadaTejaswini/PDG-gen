/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String ss=s.next();
	String t=s.next();
	
	String s1="";
	
	for(int i=0;i<n;i++)
	s1+=ss.charAt(i)+""+t.charAt(i);
	
	System.out.println(s1);
		}
}