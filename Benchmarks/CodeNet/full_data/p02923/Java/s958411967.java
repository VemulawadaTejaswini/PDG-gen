						//		package Dynamic;
import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static public void main(String[] args)throws IOException{
    	st=new StringTokenizer(br.readLine());
    	int n=i();
    	int ar[]=ari(n);
    	int i=0;
    	int m=Integer.MIN_VALUE;
    	for(int x=0;x<n-1;x++)
    	{
    		if(ar[x+1]<=ar[x])	{i++;}
    		else	
    			{
    			m=Math.max(m,i);
    			i=0;
    			
    			}
    	}
    	m=Math.max(m,i);
    	//i+=2;
    	pl(m);
    }
    static int i()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Integer.parseInt(st.nextToken());
    }
    static long l()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Long.parseLong(st.nextToken());
    }
    static String s()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return st.nextToken();
    }
    static double d()throws IOException
    {
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	return Double.parseDouble(st.nextToken());
    }
    static void p(String p)
    {
    	System.out.print(p);
    }
    static void p(int p)
    {
    	System.out.print(p);
    }
    static void p(double p)
    {
    	System.out.print(p);
    }
    static void p(long p)
    {
    	System.out.print(p);
    }
    static void p(char p)
    {
    	System.out.print(p);
    }
    static void p(boolean p)
    {
    	System.out.print(p);
    }
    static void pl(String pl)
    {
    	System.out.println(pl);
    }
    static void pl(int pl)
    {
    	System.out.println(pl);
    }
    static void pl(char pl)
    {
    	System.out.println(pl);
    }
    static void pl(double pl)
    {
    	System.out.println(pl);
    }
    static void pl(long pl)
    {
    	System.out.println(pl);
    }
    static void pl(boolean pl)
    {
    	System.out.println(pl);
    }
    static void pl()
    {
    	System.out.println();
    }
    static int[] ari(int n)throws IOException
    {
    	int ar[]=new int[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=i();
    	return ar;
    }
    static long[] arl(int n)throws IOException
    {
    	long ar[]=new long[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=l();
    	return ar;
    }
    static String[] ars(int n)throws IOException
    {
    	String ar[]=new String[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=s();
    	return ar;
    }
    static double[] ard(int n)throws IOException
    {
    	double ar[]=new double[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=d();
    	return ar;
    }
    static char[] arc(int n)throws IOException
    {
    	char ar[]=new char[n];
    	if(!st.hasMoreTokens())
    		st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=st.nextToken().charAt(0);
    	return ar;
    }
    static void pari(int ar[])
    {
    	for(int a:ar)
    		System.out.print(a+" ");
    }
    static void parl(long ar[])
    {
    	for(long a:ar)
    		System.out.print(a+" ");
    }
    static void pars(String ar[])
    {
    	for(String a:ar)
    		System.out.print(a+" ");
    }
    static void pard(double ar[])
    {
    	for(double a:ar)
    		System.out.print(a+" ");
    }
    static void parc(char ar[])
    {
    	for(char a:ar)
    		System.out.print(a+" ");
    }
}
class ar implements Comparable<ar>
{
	int ar[]=new int[2];
	ar(int arr[])
	{
		ar[0]=arr[0];
		ar[1]=arr[1];
	}
	public int compareTo(ar o)
	{
		return this.ar[0]>o.ar[0]?1:this.ar[0]==o.ar[0]?0:-1;
	}
}