import java.io.*;
import java.util.*;

public class Main {
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

	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	int n=s.nextInt();
	long t=s.nextInt();
	long a[][]=new long[n][4];
	for(int i=0;i<n;i++)
	{a[i][0]=i;
	a[i][1]=s.nextLong();
	a[i][2]=s.nextLong();
	a[i][3]=(i+1)*a[i][1]+a[i][2]+(i+1);
	}
	sortbyColumn(a,3);
	long max=0,min=a[0][0];
	long ans=0;
	for(int i=0;i<n;i++)
	{ans=ans+a[i][3]-Math.abs((a[i][0]-min));
	if(ans<=t)
	{max++;
	    min=Math.min(min,a[i][0]);
	}}
	System.out.println(max);
	}}