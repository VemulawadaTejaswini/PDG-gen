
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;


public  class Main 
{

	   
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

  

	  // Complete the hurdleRace function below.
//    public static void solve() {
//    	FastReader s=new FastReader();

   
    public static void main(String[] args) throws IOException {
    	FastReader s=new FastReader();
        int n =s.nextInt();
        int m =s.nextInt();
        boolean[] ac  = new boolean[105000];
        int[] wa  = new int[105000];
        int wnum=0,acnum=0;
        for(int i=0;i<m;i++) {
        	int p = s.nextInt();
        	String se = s.next();
        	
        	if(ac[p]!=true) {
        		if(se.equals("AC")) {
        			ac[p]=true;
        			wnum+=wa[p];
        			acnum++;
        		}
        		else wa[p]++;
        	}
        	
        }
        System.out.println(acnum+" "+wnum);
       	
    }	
}





        
    

      
 