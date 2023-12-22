import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



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
		int x;
		int y;
		Pair(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
		
	    @Override
	    public int hashCode() {
	        return (this.x ^ this.y);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Pair other = (Pair) obj;
	        if (x != other.x)
	            return false;
	        if (y != other.y)
	            return false;
	        return true;
	    }
	    
	    static class Compare { 
			  
		    static void compare(Pair arr[]) 
		    { 
		        // Comparator to sort the pair according to second element 
		        Arrays.sort(arr, new Comparator<Pair>() { 
		            @Override public int compare(Pair p1, Pair p2) 
		            { 	
		            	if(p1.y != p2.y)
		                return p1.y - p2.y; 
		            	
		            	else
		            	return p2.x-p1.x;
		            } 
		        }); 
		  
		       
		    } 
		}
	}
	
	static class Edge
	{
		int x;
		int y;
		Edge(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	static class Compare { 
		  
	    void compare(Pair arr[]) 
	    { 
	        // Comparator to sort the pair according to second element 
	        Arrays.sort(arr, new Comparator<Pair>() { 
	            @Override public int compare(Pair p1, Pair p2) 
	            { 	
	                return p1.y - p2.y;
	            } 
	        }); 
	  
	       
	    } 
	} 
	public static long gcd(long a,long b)  
	{  
	    if (a == 0)  
	        return b;  
	    return gcd(b%a, a);  
	}  
	  

	
	
	
	public static long power(long x,long y,long m)  
    { 
        if (y == 0) 
            return 1; 
          
        long p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
      
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    }
	
	static int dp[][];
	static int a[],b[];
	static int INF;
	public static int top_down(int h,int p)
	{	
		
		if(h <= 0) return 0;
		if(p < 0) return INF;
		if(dp[h][p] != INF) return dp[h][p];
		
		dp[h][p] =  b[p]+ top_down(h-a[p],p);
		dp[h][p] = Math.min(dp[h][p],top_down(h,p-1));
		return dp[h][p];
	}
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        int h = sc.nextInt();
        int n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        
        for(int i = 0; i < n; i++)
        {
        	a[i] = sc.nextInt();
        	b[i] = sc.nextInt();
        }
        dp = new int[h+1][n];
        
        INF = Integer.MAX_VALUE;
        
        for(int i = 0; i <= h; i++)
        {
        	Arrays.fill(dp[i],INF);
        }
        
        int ans = top_down(h,n-1);
        out.println(ans);
        out.close();
	}

}
