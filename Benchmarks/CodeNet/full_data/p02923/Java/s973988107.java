import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    int n=s.nextInt();
   
   int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    int c=0;
    int max=-1;
    for(int i=0;i<n-1;i++){
      if(a[i]>=a[i+1])
      {  c++;
      if(c>max)
        max=c;
      }
      else
        c=0;
      
      }
    System.out.println(Math.max(max,0));
    }
    
}