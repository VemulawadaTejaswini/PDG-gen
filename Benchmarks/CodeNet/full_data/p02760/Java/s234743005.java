import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	long a[][]=new long[3][3];
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++)
	a[i][j]=s.nextLong();
	}
	int n=s.nextInt();
	for(int kk=0;kk<n;kk++)
	{long p=s.nextLong();
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++)
	{if(a[i][j]==p)
	a[i][j]=-1;}}}
	boolean flag=false;
	if(a[0][0]==-1 && a[0][1]==-1 &&a[0][2]==-1)
	flag=true;
	if(a[1][0]==-1 &&a[1][1]==-1 &&a[1][2]==-1)
	flag=true;
	if(a[2][0]==-1 &&a[2][1]==-1 &&a[2][2]==-1)
	flag=true;
	if(a[0][0]==-1 &&a[1][1]==-1 &&a[2][2]==-1)
	flag=true;
	if(a[0][2]==-1 &&a[1][1]==-1 &&a[2][0]==-1)
	flag=true;
	if(flag)
	System.out.println("Yes");
	else
	System.out.println("No");
	}
}