/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< n; ++i)
			arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		int ans = 1;
		
		int last = arr[n - 1];
		for(int i = n-2; i>= 0; --i) {
			if(arr[i] < last) {
				++ans;
				last = arr[i];
			}
		}
		
		System.out.println(ans);
	}
}