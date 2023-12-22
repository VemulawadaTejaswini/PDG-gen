/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int queens[][]=new int[n][n];
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)a[i][j]=0;
		setboard(queens,n);
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++)System.out.println(queens[i][j]+" ");
		    System.out.println("");
		}
	}
    boolean setboard(int[][] a,int n){
        
    }
}
