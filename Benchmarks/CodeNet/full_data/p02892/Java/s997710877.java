import java.io.*;import java.util.*;import java.math.*;
public class Main{
	static int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
	static long maxl=Long.MAX_VALUE,minl=Long.MIN_VALUE;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static int max(int a,int b){return Math.max(a,b);}
    static int min(int a,int b){return Math.min(a,b);}
    static int abs(int a){return Math.abs(a);}
    static long max(long a,long b){return Math.max(a,b);}
    static long min(long a,long b){return Math.min(a,b);}
    static long abs(long a){return Math.abs(a);}
    static int sq(int a){return (int)Math.sqrt(a);}
    static long sq(long a){return (long)Math.sqrt(a);}
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
    static char c()throws IOException
    {
    	if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
    	return st.nextToken().charAt(0);
    }
    static boolean b()throws IOException
    {
    	if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
    	return Boolean.parseBoolean(st.nextToken());
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
    		for(int y=0;y<m;y++)
    			ar[x][y]=Integer.parseInt(st.nextToken());
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
    		for(int y=0;y<m;y++)
    			ar[x][y]=Long.parseLong(st.nextToken());
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
    static String[][] ars(int n,int m)throws IOException
    {
    	String ar[][]=new String[n][m];
    	for(int x=0;x<n;x++)
    	{
    		st=new StringTokenizer(br.readLine());
    		for(int y=0;y<m;y++)
    			ar[x][y]=st.nextToken();
    	}
    	return ar;
    }
    static double[] ard(int n)throws IOException
    {
    	double ar[]=new double[n];
    	st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=Double.parseDouble(st.nextToken());
    	return ar;
    }
    static double[][] ard(int n,int m)throws IOException
    {
    	double ar[][]=new double[n][m];
    	for(int x=0;x<n;x++)
    	{
    		st=new StringTokenizer(br.readLine());
    		for(int y=0;y<m;y++)
    			ar[x][y]=Double.parseDouble(st.nextToken());
    	}
    	return ar;
    }
    static char[] arc(int n)throws IOException
    {
    	char ar[]=new char[n];
    	st=new StringTokenizer(br.readLine());
    	for(int x=0;x<n;x++)
    		ar[x]=st.nextToken().charAt(0);
    	return ar;
    }
    static char[][] arc(int n,int m)throws IOException
    {
    	char ar[][]=new char[n][m];
    	for(int x=0;x<n;x++)
    	{
    		st=new StringTokenizer(br.readLine());
    		for(int y=0;y<m;y++)
    			ar[x][y]=st.nextToken().charAt(0);
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
    	for(long a:ar) sb.append(a+" ");
    	System.out.println(sb);
    }
    static void p(long ar[][])
    {
    	StringBuilder sb;
    	for(long a[]:ar)
    	{
    		sb=new StringBuilder("");
    		for(long aa:a) sb.append(aa+" ");
    		System.out.println(sb);
    	}
    }
    static void p(String ar[])
    {
    	StringBuilder sb=new StringBuilder("");
    	for(String a:ar) sb.append(a+" ");
    	System.out.println(sb);
    }
    static void p(String ar[][])
    {
    	StringBuilder sb;
    	for(String a[]:ar)
    	{
    		sb=new StringBuilder("");
    		for(String aa:a) sb.append(aa+" ");
    		System.out.println(sb);
    	}
    }
    static void p(double ar[])
    {
    	StringBuilder sb=new StringBuilder("");
    	for(double a:ar) sb.append(a+" ");
    	System.out.println(sb);
    }
    static void p(double ar[][])
    {
    	StringBuilder sb;
    	for(double a[]:ar)
    	{
    		sb=new StringBuilder("");
    		for(double aa:a) sb.append(aa+" ");
    		System.out.println(sb);
    	}
    }
    static void p(char ar[])
    {
    	StringBuilder sb=new StringBuilder("");
    	for(char a:ar) sb.append(a+" ");
    	System.out.println(sb);
    }
    static void p(char ar[][])
    {
    	StringBuilder sb;
    	for(char a[]:ar)
    	{
    		sb=new StringBuilder("");
    		for(char aa:a) sb.append(aa+" ");
    		System.out.println(sb);
    	}
    }
    static public void main(String[] args)throws Exception{
    	//st=new StringTokenizer(br.readLine());
    	int n=Integer.parseInt(br.readLine());
    	int ar[][]=new int[n][n];
    	String s="";
    	for(int x=0;x<n;x++)
    	{
    		s=br.readLine();
    		for(int y=0;y<n;y++)
    		{
    			ar[x][y]=Integer.parseInt(""+s.charAt(y));
    		}
    	}
    	boolean bo[]=new boolean [n+1];
    	HashMap<Integer,Integer> h=new HashMap<>();
    	int c=1;
    	for(int x=0;x<n;x++)
    	{
    		bo[x]=true;
    		Integer q=h.get(x+1);
    		int val=0;
    		if(q==null)
    		{
    			h.put(x+1,1);
    			val=1;
    		}
    		else val=q;
    		for(int y=0;y<n;y++)
    		{
    			if(ar[x][y]==1&&!bo[y]&&h.get(y+1)==null)
    			{
    				h.put(y+1,val+1);
    			}
    		}
    	}
    	//pl(h);
    	for(int x=0;x<n;x++)
    	{
    		for(int y=0;y<n;y++)
        	{
    			if(ar[x][y]==1)
    			{
    				if(abs(h.get(x+1)-h.get(y+1))!=1)
    				{
    					pl(-1);
    					System.exit(0);
    				}
    			}
        	}
    	}
		ArrayList<Integer> al[]=new ArrayList[n+1];
		int mn=min;
		for(int x=0;x<=n;x++)
		{
			al[x]=new ArrayList<>();
		}
		for(int ee:h.keySet())
		{
			al[h.get(ee)].add(ee);
			mn=max(mn,h.get(ee));
		}
		int cc=mn-1;
		int kk=mn;
		if(mn>=3)
		{
			o:
			for(int ee:al[2])
			{
				
				for(int eee:al[3])
				{
					if(ee==eee) continue o;
				}
				mn++;
				break;
			}
		}
		//pl(cc);
    	if(cc>2)
    	{
    		o:
    			for(int ee:al[cc])
    			{
    				
    				for(int eee:al[cc-1])
    				{
    					if(ee==eee) continue o;
    				}
    				mn++;
    				break;
    			}
    	}
    	
    	pl(mn);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}

