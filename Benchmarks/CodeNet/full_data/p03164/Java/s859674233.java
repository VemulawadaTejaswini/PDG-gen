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
		
		HashMap<Integer, Integer> map 
            = new HashMap<>(); 
		map.put(0,0);
		int max = 0;
		
		for(int i = 0; i < n; i++){
		    Set<Integer> keys = map.keySet();
		    Iterator itr = keys.iterator();
		    
		    for(int w1 : keys){
		        if(w1+wt[i] <= w){
		            Integer v1 = map.get(w1);
		            Integer v2 = map.get(w1+wt[i]);
		            if(v2 == null || v2 < v1+val[i]){
		                map.put(w1+wt[i],v1+val[i]);
		                max = Math.max(max,v1+val[i]);
		            }
		        }
		    }
		}
		System.out.println(max);
		
	}
}