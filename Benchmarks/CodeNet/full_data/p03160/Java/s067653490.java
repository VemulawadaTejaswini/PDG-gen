import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n]; int arr1[]=new int[n+1];
      arr1[0]=0;arr1[1]=1;
      for(int a=2;a<n;a++)
      {arr[a]=sc.nextInt();
      }
      for(int a=2;a<=n;a++)
      {arr1[a]=Math.min(arr1[a-1]+Math.abs(arr[a]-arr[a-1]),arr1[a-2]+Math.abs(arr[a]-arr[a-2]));      
      }
      System.out.println(arr[n+1]);
}}