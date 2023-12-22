

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
	 static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	       
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreTokens()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken();
	            
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        }

			public Character charAt(int i) {
				// TODO Auto-generated method stub
				return null;
			} 
	    }

	 static int gcd(int a , int b) {
		 if(b==0)return a;
		 return gcd(b,a%b);
	 }

	/**
	 * @param args
	 * @throws IOException
	 */
	 static int m =(int) (1e9+7);
	 static long mod(long x) {
		 
		 return ((x%m+m)%m);
	 }
	 static long add(long x,long y) {
		 return mod((mod(x)+mod(y)));
	 }
	 static long mul(long x,long y) {
		 return mod((mod(x)*mod(y)));
	 }
	 
	public static void main(String[] args)throws IOException  {
		FastReader s=new FastReader();		
		int n = s.nextInt();
		int[] ar = new int[n];
		int[] t = new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
			t[i]=ar[i];
		}
		
		Arrays.sort(t);
		int max1 = t[n-1];
		int max2 =t[n-2];
		
		int k=n-1;
		for(int i=0;i<n;i++) {
			if(ar[i]==max1)System.out.println(max2);
			else System.out.println(max1);
		}
		
	}
}
	

