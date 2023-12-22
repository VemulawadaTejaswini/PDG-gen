/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	 
  public static void main(String args[])
  {
      int p;
   
    int n,k;
    Scanner sc = new Scanner(System.in);
    int i,j;
    
    n = sc.nextInt();
    p= sc.nextInt();
    
    int arr[]= new int[n];
    
    for(i=0;i<n;i++)
    {
      
     arr[i]=sc.nextInt(); 
      
    }
    int s = n*(n-1)/2;
    long  pro []= new  long[s];
     k=0;
    for(i=0;i<n-1;i++)
    {
      
      for(j=i+1;j<n;j++)
      {
        pro[k++]=(long) arr[i] * arr[j];
      }
        
    }
    
    Arrays.sort(pro);
    
    System.out.println(pro[p-1]);
    
    
  }
  
}
