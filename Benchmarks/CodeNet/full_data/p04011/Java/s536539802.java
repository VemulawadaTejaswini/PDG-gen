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
	    int n = ob.nextInt(),k=ob.nextInt(),x=ob.nextInt(),y=ob.nextInt();
	    int ans ;
	    if(k>=n){
	        System.out.println(x*n);
	    }
	    else{
	        System.out.println(x*k + (n-k)*y);
	    }
	     
	}
}