/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int n = s.length();
		String s1 = s.substring(0,(n-1)/2);
		String s2 = s.substring((n+1)/2,n);
		if(isPalin(s)&&isPalin(s1)&&isPalin(s2))
		    System.out.println("Yes");
		else
		    System.out.println("No");
		
	}
	static boolean isPalin(String s)
	{
	    if(s.length()==1)
	        return true;
	    int i=0,j=s.length()-1;
	    boolean flag = false;
	    while(i<j)
	    {
	        if(s.charAt(i)==s.charAt(j))
	            flag = true;
	        else{
	            flag = false;
	            break;
	        }
	        i++;
	        j--;
	    }
	    return flag;
	}
}