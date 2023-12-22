/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String c=s.next();
		if(c=="MON")
		System.out.println("6");
		else if(c=="TUE")
		System.out.println("5");
		else if(c=="WED")
		System.out.println("4");
		else if(c=="THU")
		System.out.println("3");
		else if(c=="FRI")
		System.out.println("2");
		else if(c=="SAT")
		System.out.println("1");
		else
		System.out.println("7");}}