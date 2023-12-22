/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n+1];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    arr[n] = arr[n-1];
	    if(arr[0]!=0){
	        System.out.println(-1);return;
	    }
	    for(int i=1;i<n;i++){
	        if(arr[i]!=0 && arr[i]-arr[i-1] > 1){
	            System.out.println(-1);return;
	        }
	    }
	    int ans = 0;
	    for(int i=1;i<=n;i++){
	         if(arr[i] <= arr[i-1]){
	            ans+=arr[i-1];
	        } 
	    }
	    System.out.println(ans);return;
	}
}