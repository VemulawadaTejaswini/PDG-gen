import java.util.*;
import java.lang.*;

// Working program with FastReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
class Main{
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
            while (st == null || !st.hasMoreElements()) 
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
    }

     

   public static void main(String[] args){

      
      FastReader sc=new FastReader();

      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      int dp[]=new int[n];
      dp[0]=0;
      for(int i=1;i<n;i++){

           if(i-2>=0){ 
           dp[i]=Math.min(dp[i-1]+Math.abs(arr[i-1]-arr[i]),dp[i-2]+Math.abs(arr[i-2]-arr[i]));
           }
           else dp[i]=dp[i-1]+Math.abs(arr[i-1]-arr[i]);
      }

      System.out.println(dp[n-1]);



     
   }


}