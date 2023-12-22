import java.io.*;
import java.util.*;
import java.math.*;
public class Main {

    InputStream is;
    PrintWriter out;
    
    long mod = (long)(1e9 + 7), inf = (long)(1e18);
   //pair class::sieve::modPower::gcd::lbound
	  
	
	  
    void solve()
    {
		int n=ni(),k=ni();
		int h[]=na(n);
		long dp[]=new long[n];
		
		
		if(n==1){
			out.println(0);return;}
		
		
		if(k>=n-1)
		{
			out.println(Math.abs(h[n-1]-h[0]));
			return;
		}
		dp[0]=0;
		for(int i=1;i<k;i++)
		dp[i]=Math.abs(h[i]-h[0]);
		for(int i=k;i<n;i++)
		{
			dp[i]=Integer.MAX_VALUE;
			for(int j=1;j<=k;j++)
			{
			dp[i]=Math.min(dp[i-j]+Math.abs(h[i]-h[i-j]),dp[i]);
			}
		}
		out.println(dp[n-1]);
	}
	
	
	
	

	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 static ArrayList<Integer> sieve(int n)
	{
		boolean mark[]=new boolean[n+1];
		mark[0]=mark[1]=true;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(mark[i]==false){
			for(int p=2*i;p<n;p+=i)
			mark[p]=true;}}

		ArrayList<Integer> l=new ArrayList<Integer>();
		int ind=0;
		for(int i=0;i<n+1;i++)
		{
			if(mark[i]==false)
			l.add(i);
		}
		return l;
		
	}
	 
	
	
	   static long gcd(long a, long b) 
	{ 
   		 if (b == 0) 
        	return a; 
    	return gcd(b, a % b);  
	}




	
	static long lbound(LinkedList<Long> l,long ele)
	{
		int low=0;
		int high=l.size()-1;
		int ans=0;
		while(low<high)
		{
			int mid=(low+high)/2;
			if(l.get(mid)==ele)
			{ans=mid;break;}
			else if(l.get(mid)>ele)
			{high=mid-1;}
			else
			{ans=mid;low=mid;}	
		}
		return l.get(ans);
	}
	  
	  
	  
	static long modPower(long x, long y, long p) 
    { 
        long res = 1;      
        x = x % p;  
        while (y > 0) 
        { 
            if((y & 1)==1) 
                res = (res * x) % p; 
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    } 
  
static  class pair
 {
 int key;
 int value;	 	
 public pair(int key,int value)
 {
	 this.key=key;
	 this.value=value;
 }
}

    //---------- I/O Template ----------
    
    public static void main(String[] args) { new Main().run(); }
    void run() { 
        is = System.in; 
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
    
    byte input[] = new byte[1024];
    int len = 0, ptr = 0;
    
    int readByte() { 
        if(ptr >= len) { ptr = 0; 
            try { len = is.read(input); } 
            catch(IOException e) { throw new InputMismatchException(); } 
            if(len <= 0) { return -1; } 
        } return input[ptr++];
    }
    boolean isSpaceChar(int c) { return !( c >= 33 && c <= 126 ); }
    int skip() { 
        int b = readByte(); 
        while(b != -1 && isSpaceChar(b)) { b = readByte(); } 
        return b;
    }
    
    char nc() { return (char)skip(); }
    String ns() { 
        int b = skip(); 
        StringBuilder sb = new StringBuilder(); 
        while(!isSpaceChar(b)) { sb.appendCodePoint(b); b = readByte(); } 
        return sb.toString();
    }
    String nLine() { 
        int b = skip(); 
        StringBuilder sb = new StringBuilder(); 
        while( !(isSpaceChar(b) && b != ' ') ) { sb.appendCodePoint(b); b = readByte(); } 
        return sb.toString();
    }
    int ni() { 
        int n = 0, b = readByte(); 
        boolean minus = false; 
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')) { b = readByte(); } 
        if(b == '-') { minus = true; b = readByte(); } 
        if(b == -1) { return -1; }  //no input 
        while(b >= '0' && b <= '9') { n = n * 10 + (b - '0'); b = readByte(); } 
        return minus ? -n : n;
    }
    long nl() { 
        long n = 0L;    int b = readByte(); 
        boolean minus = false; 
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')) { b = readByte(); } 
        if(b == '-') { minus = true; b = readByte(); } 
        while(b >= '0' && b <= '9') { n = n * 10 + (b - '0'); b = readByte(); } 
        return minus ? -n : n;
    }

    double nd() { return Double.parseDouble(ns()); }
    float nf() { return Float.parseFloat(ns()); }
    int[] na(int n) { 
        int a[] = new int[n]; 
        for(int i = 0; i < n; i++) { a[i] = ni(); } 
        return a;
    }
    char[] ns(int n) { 
        char c[] = new char[n]; 
        int i, b = skip(); 
        for(i = 0; i < n; i++) { 
            if(isSpaceChar(b)) { break; } 
            c[i] = (char)b; b = readByte(); 
        } return i == n ? c : Arrays.copyOf(c,i);
    }
	
}