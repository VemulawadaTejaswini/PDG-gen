/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

public class Main {
    private static boolean bsearch(int arr[], int l, int r, int k){
        if(l>r){
            return false;
        }
        int mid = (l+r)/2;
        if(arr[mid]<k){
            return bsearch(arr, mid+1, r, k);
        }
        if(arr[mid]==k){
            return true;
        }
        return bsearch(arr, l, mid-1, k);
    }
	public static void main (String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i= 1;
	    int ans = Integer.MAX_VALUE;
	    while(true){
	        if(i>n/2){
	            break;
	        }
	        String o = i+"";
	        String o1 = (n-i)+"";
	        int a = 0;
	        for(int ii=0;ii<o.length();ii++){
	            a+=o.charAt(ii)-'0';
	        }
	        for(int ij=0;ij<o1.length();ij++){
	            a+=o1.charAt(ij)-'0';
	        }
	        ans= Math.min(ans,a);
	        i++;
	    }
	    System.out.println(ans);
	}
}