/*
LANG: JAVA
TASK: 
*/

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner c = new Scanner(System.in);
		int x = c.nextInt(), a = c.nextInt(), b = c.nextInt();
		System.out.println((Math.abs(x-a) < Math.abs(x-b))?"A":"B");
	}
}
