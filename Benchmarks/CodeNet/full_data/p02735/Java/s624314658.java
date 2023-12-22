import java.util.*;
 import java.math.BigInteger;
public class Main
{
	static int ans[];
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		// String h[]=sc.nextLine().split(" ");
		// long n=Long.parseLong(sc.nextLine());
		String h[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(h[0]);
		int m=Integer.parseInt(h[1]);
		int grid[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			String hh[]=sc.nextLine().split("");
			for(int j=0;j<m;j++)
			{
				if(hh[j].equals("#"))
				{
					grid[i][j]=-1;
				}
			}
		}
		for(int i=1;i<m;i++)
		{
			grid[0][i]+=grid[0][i-1];
		}
		for(int i=1;i<n;i++)
		{
			grid[i][0]+=grid[i-1][0];
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
			}
		}
		System.out.println(-grid[n-1][m-1]);
		
		
	}
	static long get3(double n, int steps)
	{
		if(n<1){return Integer.MAX_VALUE;}
		if(n==1){return steps;}

		System.out.println(n);
		return get3(n/2.0-1,steps+1);
	}
	static String get(long a, long b)
	{long y=1;
		while(true)
		{

			long z=y-a;
			long q=get2(y,z);
			// System
			if(q==b){return y+" "+z;}
			else if(q>b){return "-1";}
			y+=1;
		}
		// return "-1";
	}
	static long get2(long y, long z)
	{
		return (long)(Math.pow(y,4)+Math.pow(y,3)*z+Math.pow(y,2)*Math.pow(z,2)+y*Math.pow(z,3)+Math.pow(z,4));
	}
	static void get(ArrayList<ArrayList<Integer>>arr, int i , int p,int val[], int arr1[], int len)
	{
		for(int j=0;j<arr.get(i).size();j++)
		{
			if(ans[arr.get(i).get(j)]==0 && arr.get(i).get(j)!=p){
			if(val[arr.get(i).get(j)]>arr1[len-1])
			{
				arr1[len]=val[arr.get(i).get(j)];
				ans[arr.get(i).get(j)]=len+1;
				get(arr,arr.get(i).get(j),i,val,arr1,len+1);
				
			}
			else
			{
				int index=bin(arr1, val[arr.get(i).get(j)], len-1);
				ans[arr.get(i).get(j)]=len;
				// int g=arr1[index];
				arr1[index]=val[arr.get(i).get(j)];
				get(arr,arr.get(i).get(j),i,val,arr1,len);
				// arr1[index]=g;
			}}

		}
	}
	static int bin(int arr[], int val, int len)
	{
		if(arr[0]>=val){return 0;}
		int l=0;
		int r=len;
		while (r - l > 1) { 
            int m = l + (r - l) / 2; 
            if (arr[m] >= val) 
                r = m; 
            else
                l = m; 
        } 
  
        return r; 
		// return l;
	}
	
	

}
class Pair
{
	int a;
	int b;
	int c;
	int d;
	Pair(int e,int f, int g,int h){
		a=e;
		b=f;
		c=g;
		d=h;
	}
}



	
