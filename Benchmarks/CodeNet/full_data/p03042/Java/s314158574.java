/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		char[] s = scan.next().toCharArray();
		int x,y;
		x = (s[0]-'0')*10 +(s[1]-'0');
		y = (s[2]-'0')*10 + (s[3] - '0');// your code goes here
		int mask= 0;
		if(x<=12&&x>0){
			mask |= 1;
		}
		if(y<=12&&y>0){
			mask |=2;
			
		}
		if(mask==3){
			System.out.println("AMBIGUOUS");
		}else if(mask==2){
			System.out.println("YYMM");
		}else if(mask==1){
			System.out.println("MMYY");
		}else{
			System.out.println("NA");
		}
		
		
		
	}
}