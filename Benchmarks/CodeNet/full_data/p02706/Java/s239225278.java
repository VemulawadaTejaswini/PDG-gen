/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		int assignment = input.nextInt();
		int daysToComplete= 0;
		for(int i = 0;i<assignment;i++){
		    daysToComplete+=input.nextInt();
		}
		if(assignment>days || daysToComplete>days){
		    System.out.println("-1");
		}else {
		    System.out.println(days- daysToComplete);
		}
	}
}
