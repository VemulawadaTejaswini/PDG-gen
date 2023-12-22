/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; ++i)
			arr[i] = in.nextInt();
			
		Arrays.sort(arr);
		System.out.println(arr[2]);
	}
}