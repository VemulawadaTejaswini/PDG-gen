/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void sortbyColumn(long arr[][], int col) 
    {Arrays.sort(arr, new Comparator<long[]>() { 
           @Override
           
          public int compare(final long[] entry1, final long[] entry2) { 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1;} 
        });
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long a[][]=new long[n][2];
		for(int i=0;i<n;i++)
		{long k=s.nextLong();
		 long p=s.nextLong();
		 a[i][0]=k-p;
		 a[i][1]=k+p;}
		 sortbyColumn(a,1);
		 int count=0;
		 long f=a[0][1];
		 count++;
		 for(int i=1;i<n;i++)
		 {if(f<=a[i][0])
		 {count++;f=a[i][1];}}
		 System.out.println(count);}}
		 
