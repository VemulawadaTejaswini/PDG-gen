/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	static String sorting(int[] arr){
			int n = arr.length;
			int count = 0;
			for(int i=0;i<n;i++){
				if(arr[i]!=i+1){
					count++;
				}
			}
			return((count==2||count==0)?"YES":"NO");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println(sorting(arr));

	}
}
