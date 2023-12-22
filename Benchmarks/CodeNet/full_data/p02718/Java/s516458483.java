import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
	
	
	
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int arr[]=new int[n+1];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	int sum=0;
    	for(int i=0;i<n;i++)
    	{
    		sum=sum+arr[i];
    	}
    	int val=(sum)/(4*m);
  
    	int count=0;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]>=val)
    		{
    			//System.out.print(arr[i]);
    			count++;
    		}
    	}
    	if(count>=m)
    	{
    		System.out.println("Yes");
    	}
    	else
    	{
    		System.out.println("No");
    	}
    	
    	
       
        
       
    	

     }
    	
    	
    	
    	
    
}

