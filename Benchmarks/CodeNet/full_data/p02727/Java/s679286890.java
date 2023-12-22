import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
 
public class Main{
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	
	static class Pair
	{
		int p;
		int q;
		Pair(int p,int q)
		{
			this.p = p;
			this.q = q;
		}
	}
	
	static int gcd(int a,int b)
	{
		if(a == 0) return b;
		if(b == 0) return a;
		
		return gcd(b,a%b);
	}
	static long gcd(long a,long b)
	{
		if(a == 0) return b;
		if(b == 0) return a;
		
		return gcd(b,a%b);
	}
	static void preCompute(long fact[])
	{
		fact[0] = 1;
		for(int i = 1; i < fact.length; i++)
		{
			fact[i] = i*fact[i-1]%rem;
		}
	}
	static long power(long x, long y, long p) 
    { 
        long res = 1; 
        x = x % p; 
                      
        while (y > 0) 
        {
            if (y % 2 == 1) 
                res = (res * x) % p; 
 
            y = y >> 1; 
            x = (x * x) % p; 
        }
        return res; 
    } 
	static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    }
	
	static long nCrModPFermat(int n, int r, long p) 
	{ 
 
		if (r == 0) 
			return 1; 
 
		return (fact[n]* modInverse(fact[r], p) % p * modInverse(fact[n-r], p) % p) % p; 
	}
	static long rem = (long)(1e9)+7;
	static long fact[];
	
 
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(outputStream);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Integer ar[] = new Integer[a];
        Integer br[] = new Integer[b];
        Integer cr[] = new Integer[c];
        
        for(int i = 0; i < a; i++)
        {
        	ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        
        for(int i = 0; i < b; i++)
        {
        	br[i] = sc.nextInt();
        }
        Arrays.sort(br);
        
        for(int i = 0; i < c; i++)
        {
        	cr[i] = sc.nextInt();
        }
        Arrays.sort(cr);
        
        int ai = a-x;
        int bi = b-y;
        int ci = c-1;
        
        while(ci >= 0 && ai < a && bi < b)
        {
        	if(cr[ci] > ar[ai] || cr[ci] > br[bi])
        	{
        		if(ar[ai] < br[bi])
        		{
        			ar[ai] = cr[ci];
        			ai++;
        			ci--;
        		}
        		else
        		{
        			br[bi] = cr[ci];
        			bi++;
        			ci--;
        		}
        	}
        	else break;
        }
        
        while(ci >= 0 && ai < a)
        {
        	if(cr[ci] > ar[ai])
        	{
        		ar[ai] = cr[ci];
        		ai++;
        		ci--;
        	}
        	else break;
        }
        
        while(ci >= 0 && bi < b)
        {
        	if(cr[ci] > br[bi])
        	{
        		br[bi] = cr[ci];
        		bi++;
        		ci--;
        	}
        	else break;
        }
        
        long ans = 0L;
        for(int i = a-1; i >= a-x; i--)
        {
        	ans += ar[i];
        }
        
        for(int i = b-1; i >= b-y; i--)
        {
        	ans += br[i];
        }
        
        out.println(ans);
        out.close();
	}
 
}