

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int ar[]=new int[m];
		for(int i=0;i<m;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		Arrays.sort(ar);
		int dif[]=new int[m-1];
		long dist=0;
		for(int i=0;i<m-1;i++)
		{
			dif[i]=ar[i+1]-ar[i];
			dist+=dif[i];
		}
		
		Arrays.sort(dif);;
		for(int i=m-2;i>m-1-n;i--)
		{
			dist-=dif[i];
		}System.out.println(dist);
	}
}
