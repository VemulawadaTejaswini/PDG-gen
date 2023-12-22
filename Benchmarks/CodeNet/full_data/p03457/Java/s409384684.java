/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int min=0;
		int time=0;
		int row=0;
		int col=0;
		int count=0;
		int a[][]=new int[n][3];
		for(int i=0;i<n;i++)
		for(int j=0;j<3;j++)
		a[i][j]=in.nextInt();
		for(int k=0,s=1;s<n;s++,k++){
		time=a[s][0]-a[k][0];
		row=a[s][1]-a[k][1];
		col=a[s][2]-a[k][2];
		if(row<0)
		row=-row;
		if(col<0)
		col=-col;
		min=row+col;
		if(min<=time){
		if ((row==0 || col==0 )&& (time-min)%2==0)
		count ++;
		else if((time-min)%4==0)
		count ++;
		}
		
		}
		if(n!=1){if(count==(n-1))
		System.out.println("Yes");
		else System.out.println("No");}
		if(n==0 && time==0){
			System.out.println("Yes");
		}
}}