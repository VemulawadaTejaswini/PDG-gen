//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int n,m;
	static int nax = (int)1e5+5;
	static Pair[] down = new Pair[nax], up = new Pair[nax];
	static ArrayList<Pair>[] downs, pref, suf;
//	<black,white>

	static ArrayList<Integer>[] edges,children;
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		m=scn.nextInt();
		edges = new ArrayList[nax];
		children = new ArrayList[nax];
		downs = new ArrayList[nax];
		pref = new ArrayList[nax];
		suf = new ArrayList[nax];
		
//		for(int i=0;i<n+1;i++) {
//			edges[i] = new ArrayList<>();
//			children[i] = new ArrayList<>();
//		}
		for(int i=0;i<nax;i++) {
			downs[i] = new ArrayList<>();
			pref[i] = new ArrayList<>();
			
			suf[i] = new ArrayList<>();
			edges[i] = new ArrayList<>();
			children[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			
			edges[a].add(b);
			edges[b].add(a);
		}
		dfs_one(1,-1);
		for(int a =1;a<=n;a++) {
			int k = downs[a].size();
			assert(k==(int)children[a].size());
			Pair p = new Pair(1,0);
			
			for(int i=0;i<k;i++) {
				p = merge(p, downs[a].get(i));
				
				pref[a].add(p);
			}
			p = new Pair(1,0);
			for(int i=k-1;i>=0;i--) {
				p = merge(p, downs[a].get(i));
				suf[a].add(p);
			}
			
			Collections.reverse(suf[a]);
		}
		
		dfs_two(1,-1);
		for(int i=1;i<=n;i++) {
			Pair p = new Pair(1,0);
			
			if(i!=1) {
				p = merge(p, up[i]);
			}
			if(!children[i].isEmpty()) {
				p = merge(p,pref[i].get(pref[i].size()-1));
			}
			p = process(p);
			
			out.write((p.sth_is_black+"\n").getBytes());
		}
		out.close();
	}
	static class Pair{
		int all_white;
		int sth_is_black;
		public Pair(int first, int second) {
			this.all_white=first;
			this.sth_is_black=second;
		}
	}
	static void dfs_one(int a, int parent) {
		Pair p = new Pair(1,0);
		for(int b:edges[a]) {
			if(b!=parent) {
				children[a].add(b);
				dfs_one(b,a);
				p = merge(p,down[b]);
				downs[a].add(down[b]);
			}
		}
		down[a] = process(p);
	}
	static void dfs_two(int a, int parent) {
		for(int i =0;i<children[a].size();i++) {
			Pair p = new Pair(1,0);
			if(i!=0) {
				p= merge(p,pref[a].get(i-1));
			}
			
			if(i!=downs[a].size()-1) {
				p = merge(p, suf[a].get(i+1));
			}
			if(a!=1) {
				p=merge(p,up[a]);
			}
			int b = children[a].get(i);
			up[b] = process(p);
			dfs_two(b,a);
		}
	}
	static Pair merge(Pair a, Pair b) {
		Pair p = new Pair(0,0);
		p.all_white = mul(a.all_white,b.all_white);
		p.sth_is_black = add(mul(a.sth_is_black, add(b.all_white,b.sth_is_black)), mul(a.all_white,b.sth_is_black));
		return p;
	}
	static Pair process(Pair p) {
		return new Pair(p.all_white, add(p.sth_is_black,p.all_white));
	}
	static int add(int a, int b) {
		return (int) ((a+b)%m);
	}
	static int mul(int a, int b) {
		return (int) (1l*a*b%m);
	}
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
}
