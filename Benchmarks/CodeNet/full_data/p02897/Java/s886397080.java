package solution;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


    
    public class Solution{
        
        

   public static void main (String[] args)  throws IOException{

      Scanner sc=new Scanner(System.in);
      int N=0;
      if(sc.hasNextInt())
      {
          N=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<=N;i++)
      {
          if(i%2!=0)
          {
              count++;
          }
      }
      System.out.println(count);
     
     double X=(double)count/N;
      System.out.println(X);
        
       
   }
   
}
   