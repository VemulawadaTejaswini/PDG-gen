/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int res =0;
		int max = -1;
		for(int i=0;i<n-1;i++) {
			if(arr[i+1]-arr[i]>max)
				max=arr[i+1]-arr[i];
		}
		res=k-max-arr[0];
		System.out.println(res);
		sc.close();

	}
}
