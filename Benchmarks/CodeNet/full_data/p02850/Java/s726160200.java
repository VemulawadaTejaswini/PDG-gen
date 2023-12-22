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
	
	
	public static void dfs(int s,int p)
	{	
		int c = 1;
		vis[s] = true;
		for(int x:ar[s])
		{
			if(!vis[x])
			{
				if(c != p)
				{	
					maxc = Math.max(maxc, c);
					if(hs.contains(new Pair(s,x)))
					{
						hm.put(new Pair(s,x),c);
					}
					else
					hm.put(new Pair(x,s),c);
				}
				else
				{
					c++;
					maxc = Math.max(maxc, c);
					if(hs.contains(new Pair(s,x)))
					{
						hm.put(new Pair(s,x),c);
					}
					else
					hm.put(new Pair(x,s),c);
				}
				dfs(x,c);
				c++;
			}
		}
	}
	public static LinkedList<Integer> ar[];
	
	public static boolean vis[];
	public static Pair edges[];
	public static HashMap<Pair,Integer> hm;
	static int maxc;
	public static HashSet<Pair> hs;
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        int n = sc.nextInt();
        
        ar = new LinkedList[n+1];
        
        for(int i = 0; i <= n; i++)
        {
        	ar[i] = new LinkedList<>();
        }
        
        edges = new Pair[n-1];
        hs = new HashSet<>();
        for(int i = 0; i < n-1; i++)
        {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	edges[i] = new Pair(x,y);
        	hs.add(edges[i]);
        	ar[x].add(y);
        	ar[y].add(x);
        }
        hm = new HashMap<>();
       
        vis = new boolean[n+1];
        Arrays.fill(vis, false);
        maxc = 0;
        dfs(1,0);
        
        out.println(maxc);
        for(int i = 0; i < n-1;i++)
        {
        	out.println(hm.get(new Pair(edges[i].x,edges[i].y)));
        }
        out.close();
	}

}
