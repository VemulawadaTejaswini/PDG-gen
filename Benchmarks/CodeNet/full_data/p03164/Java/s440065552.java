/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;
import java.io.*;

public class Main{




   public static long func(long weight[], long value[], long total, long weightnow, int index, int n, long dp[][] )
   { 
       
       if(index>=n)
       {
           return 0;
       }
       
       if(dp[index][(int)weightnow]!=-1)
       {
           return dp[index][(int)weightnow];
       }
       long sum=0l;
     //  int sum1=0;
    long ans =0l;
       
           if(weightnow+weight[(int)index]>total)
           {  //System.out.println("weight"+weightnow+" "+weight[i]);
              // sum1+=func(weight,value,total,weightnow,i+1,n);
             sum=  func(weight,value,total,weightnow,index+1,n,dp);
           }
           else{
               ans=value[index]+func(weight,value,total,weightnow+weight[index],index+1,n,dp);
               long val1=func(weight,value,total,weightnow,index+1,n,dp);
               ans=Math.max(val1,ans);
           }
          
         ans=Math.max(ans,sum);
       
       dp[index][(int)weightnow]=ans;
       return ans ;
   }
   
     public static void main(String []args) throws Exception{
        //System.out.println("Hello World");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s =br.readLine();
       String ss[]=s.split(" ");
       long total=Long.parseLong(ss[1]);
       int n =Integer.parseInt(ss[0]);
       long weight[]=new long[n];
       long value[]=new long[n];
       String temp;
       String tempo[];
        for(int i=0;i<n;i++)
        {
         temp=br.readLine();
         tempo=temp.split(" ");
         weight[i]=Long.parseLong(tempo[0]);
         value[i]=Long.parseLong(tempo[1]);
        }
        
        
        
    long  sum=0l;
        
     long weightnow=0l;
        
      long dp[][]=new long[n][(int)(total+1)];
        long ans =0l;
        for(int y=0;y<n;y++)
        {
            Arrays.fill(dp[y],-1);
        }
        int i=0;
        long val=0l;
            if(weight[i]>total)
           {
            val=func(weight,value,total,weightnow,i+1,n,dp);
            ans =Math.max(ans , val);  
           }
           else{
             val=value[i]+func(weight,value,total,weightnow+weight[i],i+1,n,dp);
             long val1=func(weight,value,total,weightnow,i+1,n,dp);
               val=Math.max(val1,val);
               ans =Math.max(ans , val);  
           }
           // System.out.println(val);
           //ans =Math.max(ans , val);    
            
        
        
        System.out.println(ans);
        
        
        
        
     }
}

