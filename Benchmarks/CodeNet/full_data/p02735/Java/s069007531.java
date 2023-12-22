import java.io.*;import java.util.*;import java.math.*;
public class Main
{
	static long mod=1000000007l;
    static int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
    static long maxl=Long.MAX_VALUE,minl=Long.MIN_VALUE;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    static char ch[][];
    static boolean bo[][];
    static int xa,ya;
    static int ar[][];
    static public void main(String[] args)throws Exception
    {
    	st=new StringTokenizer(br.readLine());
    	int r=i();
    	int c=i();
    	xa=r;
    	ya=c;
    	ar=new int[xa][ya];
    	ch=new char[r][c];
    	bo=new boolean[r][c];
    	for(int x=0;x<r;x++)
    	{
    		String s=s();
    		for(int y=0;y<c;y++)ch[x][y]=s.charAt(y);
    	}
    	int mm=1000000;
//    	for(int x=0;x<r;x++)
//    	{
//    		for(int y=0;y<c;y++)
//    		{
//    			if(ch[x][y]=='#'&&!bo[x][y])mm=min(mm,1+f(x,y,'#'));
//    		}
//    	}
    	if(ch[0][0]=='.')pl(f(0,0,'.'));
    	else pl(1+f(0,0,'#'));
//    	for(int x=0;x<r;x++)
//    	{
//    		for(int y=0;y<c;y++)p(ar[x][y]+" ");
//    		pl();
//    	}
	}
    static int f(int x,int y,char c)
    {
    	//pl("     "+x+" "+y+" "+xa+" "+ya);
    	bo[x][y]=true;
    	if(x==xa-1&&y==ya-1)return 0;
    	int m=10000000;
    	if(c=='.')
    	{
	    	if(x!=xa-1)
    		{
	    		if(!bo[x+1][y])
	    		{
	    			if(ch[x+1][y]=='#')m=min(m,1+f(x+1,y,'#'));
	    			else m=min(m,f(x+1,y,'.'));
	    		}
	    		else
	    		{
	    			if(ch[x+1][y]=='#')m=min(m,1+ar[x+1][y]);
	    			else m=min(m,ar[x+1][y]);
	    		}
	    		//pl(x+" "+y+" "+m);
    		}
	    	if(y!=ya-1)
    		{
	    		if(!bo[x][y+1])
	    		{
	    			if(ch[x][y+1]=='#')m=min(m,1+f(x,y+1,'#'));
	    			else m=min(m,f(x,y+1,'.'));
	    		}
	    		else
	    		{
	    			if(ch[x][y+1]=='#')m=min(m,1+ar[x][y+1]);
	    			else m=min(m,ar[x][y+1]);
	    		}
    		}
	    	//pl("a   "+x+" "+y+" "+m);
    	}
    	else
    	{
    		if(x!=xa-1)
    		{
	    		if(!bo[x+1][y])
	    		{
	    			if(ch[x+1][y]=='#')m=min(m,f(x+1,y,'#'));
	    			else m=min(m,f(x+1,y,'.'));
	    		}
	    		else
	    		{
	    			if(ch[x+1][y]=='#')m=min(m,ar[x+1][y]);
	    			else m=min(m,ar[x+1][y]);
	    		}
	    		//pl(x+" "+y+" "+m);
    		}
	    	if(y!=ya-1)
    		{
	    		if(!bo[x][y+1])
	    		{
	    			if(ch[x][y+1]=='#')m=min(m,f(x,y+1,'#'));
	    			else m=min(m,f(x,y+1,'.'));
	    		}
	    		else
	    		{
	    			if(ch[x][y+1]=='#')m=min(m,ar[x][y+1]);
	    			else m=min(m,ar[x][y+1]);
	    		}
    		}
	    	//pl("b   "+x+" "+y+" "+m);
    	}
    	ar[x][y]=m;
    	//pl(x+" "+y+" "+m);
    	return m;
    }
    static int max(int a,int b){return Math.max(a,b);}
    static int min(int a,int b){return Math.min(a,b);}
    static int abs(int a){return Math.abs(a);}
    static long max(long a,long b){return Math.max(a,b);}
    static long min(long a,long b){return Math.min(a,b);}
    static long abs(long a){return Math.abs(a);}
    static int sq(int a){return (int)Math.sqrt(a);}
    static long sq(long a){return (long)Math.sqrt(a);}
    static int gcd(int a,int b) {return b==0?a:gcd(b,a%b);}
    static int ncr(int n,int c,long m)
    {
        long a=1l;
        for(int x=n-c+1;x<=n;x++)a=((a*x)%m);
        long b=1l;
        for(int x=2;x<=c;x++)b=((b*x)%m);
        long v=(div((int)b,m-2,m)%m);
        return (int)((a*v)%m);
    }
    static int fib(int n) 
    { 
        double p=(1+Math.sqrt(5))/2; 
        return (int)Math.round(Math.pow(p,n)/Math.sqrt(5)); 
    }
    static boolean[] sieve(int n)
    {
        boolean bo[]=new boolean[n+1];
        bo[0]=true;bo[1]=true;
        for(int x=4;x<=n;x+=2)bo[x]=true;
        for(int x=3;x*x<=n;x+=2)
        {
            if(!bo[x])
            {
                for(int y=x*x;y<=n;y+=x)bo[y]=true;
            }
        }
        return bo;
    }
    static int[] fac(int n)
    {
        int bo[]=new int[n+1];
        bo[0]=0;bo[1]=1;
        for(int x=1;x<=n;x++)
        {
            for(int y=x;y<=n;y+=x)bo[y]++;
        }
        return bo;
    }
    static long div(long a,long b,long m) 
    {
        long r=1l;
        a%=m;  
        while(b>0)
        {
            if((b&1)==1)r=(r*a)%m; 
            b>>=1;
            a=(a*a)%m;  
        } 
        return r; 
    }
    static int i()throws IOException
    {
        if(!st.hasMoreTokens()) st=new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    static long l()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }
    static String s()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static double d()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return Double.parseDouble(st.nextToken());
    }
    static void p(Object p){System.out.print(p);}
    static void p(String p){System.out.print(p);}
    static void p(int p){System.out.print(p);}
    static void p(double p){System.out.print(p);}
    static void p(long p){System.out.print(p);}
    static void p(char p){System.out.print(p);}
    static void p(boolean p){System.out.print(p);}
    static void pl(Object p){System.out.println(p);}
    static void pl(String p){System.out.println(p);}
    static void pl(int p){System.out.println(p);}
    static void pl(char p){System.out.println(p);}
    static void pl(double p){System.out.println(p);}
    static void pl(long p){System.out.println(p);}
    static void pl(boolean p){System.out.println(p);}
    static void pl(){System.out.println();}
    static int[] ari(int n)throws IOException
    {
        int ar[]=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++) ar[x]=Integer.parseInt(st.nextToken());
        return ar;
    }
    static int[][] ari(int n,int m)throws IOException
    {
        int ar[][]=new int[n][m];
        for(int x=0;x<n;x++)
        {
            st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Integer.parseInt(st.nextToken());
        }
        return ar;
    }
    static long[] arl(int n)throws IOException
    {
        long ar[]=new long[n];
        st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++) ar[x]=Long.parseLong(st.nextToken());
        return ar;
    }
    static long[][] arl(int n,int m)throws IOException
    {
        long ar[][]=new long[n][m];
        for(int x=0;x<n;x++)
        {
            st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Long.parseLong(st.nextToken());
        }
        return ar;
    }
    static String[] ars(int n)throws IOException
    {
        String ar[]=new String[n];
        st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++) ar[x]=st.nextToken();
        return ar;
    }
    static double[] ard(int n)throws IOException
    {
        double ar[]=new double[n];
        st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)ar[x]=Double.parseDouble(st.nextToken());
        return ar;
    }
    static double[][] ard(int n,int m)throws IOException
    {
        double ar[][]=new double[n][m];
        for(int x=0;x<n;x++)
        {
            st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Double.parseDouble(st.nextToken());
        }
        return ar;
    }
    static char[] arc(int n)throws IOException
    {
        char ar[]=new char[n];
        st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)ar[x]=st.nextToken().charAt(0);
        return ar;
    }
    static char[][] arc(int n,int m)throws IOException
    {
        char ar[][]=new char[n][m];
        for(int x=0;x<n;x++)
        {
            String s=br.readLine();
            for(int y=0;y<m;y++)ar[x][y]=s.charAt(y);
        }
        return ar;
    }
    static void p(int ar[])
    {
        StringBuilder sb=new StringBuilder("");;
        for(int a:ar) sb.append(a+" ");
        System.out.println(sb);
    }
    static void p(int ar[][])
    {
        StringBuilder sb;
        for(int a[]:ar)
        {
            sb=new StringBuilder("");
            for(int aa:a) sb.append(aa+" ");
            System.out.println(sb);
        }
    }
    static void p(long ar[])
    {
        StringBuilder sb=new StringBuilder("");
        for(long a:ar)sb.append(a+" ");
        System.out.println(sb);
    }
    static void p(long ar[][])
    {
        StringBuilder sb;
        for(long a[]:ar)
        {
            sb=new StringBuilder("");
            for(long aa:a)sb.append(aa+" ");
            System.out.println(sb);
        }
    }
    static void p(String ar[])
    {
        StringBuilder sb=new StringBuilder("");
        for(String a:ar)sb.append(a+" ");
        System.out.println(sb);
    }
    static void p(double ar[])
    {
        StringBuilder sb=new StringBuilder("");
        for(double a:ar)sb.append(a+" ");
        System.out.println(sb);
    }
    static void p(double ar[][])
    {
        StringBuilder sb;
        for(double a[]:ar)
        {
            sb=new StringBuilder("");
            for(double aa:a)sb.append(aa+" ");
            System.out.println(sb);
        }
    }
    static void p(char ar[])
    {
        StringBuilder sb=new StringBuilder("");
        for(char aa:ar)sb.append(aa+" ");
        System.out.println(sb);
    }
    static void p(char ar[][])
    {
        StringBuilder sb;
        for(char a[]:ar)
        {
            sb=new StringBuilder("");
            for(char aa:a)sb.append(aa+" ");
            System.out.println(sb);
        }
    }
}