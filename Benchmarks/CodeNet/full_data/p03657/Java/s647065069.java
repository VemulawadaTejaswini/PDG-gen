

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		if(a % 3 == 0 || b % 3 == 0 || (a+b) % 3 == 0) {
		    System.out.println("Possible");
		}
		else {
		    System.out.println("Impossible");
		}
	}
}
