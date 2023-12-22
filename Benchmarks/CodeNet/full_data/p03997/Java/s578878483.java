import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;

public class Main {
	public static IO fs = new IO();
	
	public static void solve() {
		int a = fs.nextInt(),b = fs.nextInt(),h = fs.nextInt();
		System.out.println((h*(a+b))/2);
	}
	
	public static void main(String[] args) {
		int t = 1;
		//t = fs.nextInt();
		for(int cs = 0; cs<t; cs++) {
			solve();
		}
	}
	
	static class IO 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public IO() 
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
        
        int [] readintarray(int n) {
        	int [] ret = new int[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextInt();
        	}
        	return ret;
        }
        
        long [] readlongarray(int n) {
        	long [] ret = new long[n];
        	for(int i = 0; i<n; i++) {
        		ret[i] = nextLong();
        	}
        	return ret;
        }
    }
	
	public static void sort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void rversesort(int [] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void longsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void reverselongsort(long [] a) {
		ArrayList<Long> temp = new ArrayList<>();
		for(int i = 0; i<a.length; i++) {
			temp.add(a[i]);
		}
		Collections.sort(temp);
		Collections.reverse(temp);
		for(int i = 0; i<temp.size(); i++)a[i] = temp.get(i);
	}
	
	public static void pairsort(pair [] a) {
		List<pair> temp = new ArrayList<pair>();
		for(int i = 0; i<a.length; i++)temp.add(a[i]);
		Comparator<pair> comp = (p1,p2)->{
			if(p1.first == p2.first)return (p1.second<=p2.second?1:-1);
			return (p1.first<p2.first)?1:-1;
		};
		Collections.sort(temp,comp);
		for(int i = 0; i<a.length; i++) {
			a[i] = temp.get(i);
		}
	}
	
	public static class pair{
		public int first;
		public int second;
		
		pair(int x,int y){
			this.first = x;
			this.second = y;
		}
	}
	
	public static long power(long x,long y) {
		long res = 1;
		while(y>0) {
			if(y%2 == 1)res = res*x;
			y >>= 1;
			x = x*x;
		}
		return res;
	}
	
	public static long power(long x,long y,long mod) {
		long res = 1;
		x%=mod;
		while(y>0) {
			if(y%2 == 1)res = (res*x)%mod;
			y >>= 1;
			x = (x*x)%mod;
		}
		return res;
	}
}
