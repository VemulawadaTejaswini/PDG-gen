/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int k = sc.nextInt();
	    int n = sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	    int res=0;
	    for(int i=1;i<n-1;i++) res=res+ arr[i]-arr[i-1];
	    res = res + Math.min(arr[n-1]-arr[n-2], k+arr[0]-arr[n-1]);
		System.out.println(res);
	}
}