/*package whatever //do not write package name here */

import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;


class Main {
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main (String[] args) {
		FastReader ob = new FastReader();
	    String w = ob.next();
	    int arr[] = new int[26];
	    for (int i=0;i<w.length() ; i++) {
	        int k = w.charAt(i) - 'a';
	        arr[k]=arr[k]+1;
	    }
	    for (int i=0;i<26; i++) {
	        if(arr[i]%2!=0){
	            System.out.println("No");
	            return;
	        }
	    }
	    System.out.println("Yes");
	     
	}
}