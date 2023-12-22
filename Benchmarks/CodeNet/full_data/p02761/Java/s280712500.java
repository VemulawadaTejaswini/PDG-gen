import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	int n=s.nextInt();
	int m=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=-1;
	boolean flag=true;
	if(m==0)
	System.out.print("-1");
	else
	{if(n==1)
	{for(int i=0;i<m;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	if(a[0]==-1)
	a[0]=q;
    else
	a[0]=Math.min(a[0],q);
	}   
	System.out.print(a[0]);
	}
	else if(n==2)
	{for(int i=0;i<m;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	if(p==1 && a[p-1]==-1)
	a[p-1]=q;
	else if(p==1 && a[p-1]==0)
	a[p-1]=q;
	else if(p==1 && q==0)
	{}
	else if(p==1 && a[p-1]>q)
	a[p-1]=q;
	if(p>1 && a[p-1]==-1)
	    a[p-1]=q;
	else if(p>1 && a[p-1]>q)
	a[p-1]=q;
	}
	if(a[0]<=0)
	System.out.println("-1");
	else
	{if(a[0]==-1)
	a[0]=0;
	if(a[1]==-1)
	a[1]=0;System.out.println(a[0]+""+a[1]);}
	}
	else
	{for(int i=0;i<m;i++)
	{int p=s.nextInt();
	int q=s.nextInt();
	if(p==1 && a[p-1]==-1)
	a[p-1]=q;
	else if(p==1 && a[p-1]==0)
	a[p-1]=q;
	else if(p==1 && q==0)
	{}
	else if(p==1 && a[p-1]>q)
	a[p-1]=q;
	if(p>1 && a[p-1]==-1)
	    a[p-1]=q;
	else if(p>1 && a[p-1]>q)
	a[p-1]=q;
	}
	if(a[0]<=0)
	System.out.println("-1");
	else
	{if(a[0]==-1)
	a[0]=0;
	if(a[1]==-1)
	a[1]=0;
	if(a[2]==-1)
	a[2]=0;
	System.out.println(a[0]+""+a[1]+""+a[2]);}
	}
	}}}