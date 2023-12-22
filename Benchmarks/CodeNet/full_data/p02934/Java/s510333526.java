				//				package Dynamic;
import java.io.*;
import java.util.*;
public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static public void main(String[] args)throws IOException{
    	st=new StringTokenizer(br.readLine());
    	int n=i();
    	int ar[]=ari(n);
    	int g=ar[0];
    	for(int x=1;x<n;x++)
    	{
    		g=lcm(g,ar[x]);
    	}
    	int s=0;
    	for(int x=0;x<n;x++)
    	{
    		s+=g/ar[x];
    	}
    	pl((1.0*g/s)+"");
    }
    static int gcd(int a, int b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
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
    static void pl(String pl)
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