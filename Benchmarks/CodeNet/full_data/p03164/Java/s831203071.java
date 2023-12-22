/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.*;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int[] val = new int[n];
		int[] wt = new int[n];
		
		for(int i = 0; i < n; i++){
		    wt[i] = scan.nextInt();
		    val[i] = scan.nextInt();
		}
		
		ArrayList<Integer> wts = new ArrayList<Integer>();
		ArrayList<Integer> cVals = new ArrayList<Integer>();
		wts.add(0);
		cVals.add(0);
		int max = 0;
		
		for(int i = 0; i < n; i++){
		    int size = wts.size();
		    for(int j = 0; j < size; j++){
		        if(wts.get(j)+wt[i] <= w){
		            wts.add(wts.get(j)+wt[i]);
		            cVals.add(cVals.get(j)+val[i]);
		            max = Math.max(max,cVals.get(j)+val[i]);
		        }
		    }
		}
		System.out.println(max);
		
	}
}