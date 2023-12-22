//package may2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream(System.out);
		
		int n =scn.nextInt();
		
		int[] a = new int[n];
		HashMap<Integer, Integer> even = new HashMap<>();
		HashMap<Integer, Integer> odd = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			a[i] = scn.nextInt();
		
			if(i%2==0) {
				if(even.containsKey(a[i])) {
					even.put(a[i], even.remove(a[i])+1);
				}else {
					even.put(a[i],1);
				}
			}else {
				if(odd.containsKey(a[i])) {
					odd.put(a[i], odd.remove(a[i])+1);
				}else {
					odd.put(a[i],1);
				}
			}
		}
		
		ArrayList<Integer> ks1= new ArrayList<Integer>(even.keySet());
		ArrayList<Integer> ks2= new ArrayList<Integer>(odd.keySet());
		int mf = 0;
		int mn =-1;
		for(int i:ks1) {
			if(mf<even.get(i)) {
				mf = even.get(i);
				mn=i;
			}
		}
		long ans= 0;
		for(int i:ks1) {
			if(i!=mn) {
				ans+=even.get(i);
			}
		}
		int mf2 = 0;
		int mn2 = -1;
		for(int i:ks2) {
			if(mf2<odd.get(i)) {
				mf2=odd.get(i);
				mn2=i;
			}
		}
		
		for(int i:ks2) {
			if(i!=mn2) {
				ans+=odd.get(i);
			}
		}
		if(mn==mn2) {
			int e2 =0;
			int x2 = -1;
			for(int i:ks1) {
				if(e2<even.get(i)&&even.get(i)<=mf&&i!=mn) {
					e2 = even.get(i);
					x2 = i;
				}
			}
			
			int o2 = 0;
			int y2 = -1;
			for(int i:ks2) {
				if(o2<odd.get(i)&&odd.get(i)<=mf2&&i!=mn2) {
					o2 = odd.get(i);
					y2=i;
				}
			}
			
			long ans1=0;
			for(int i:ks1) {
				if(i!=mn) {
					ans1+=even.get(i);
				}
			}
			for(int i:ks2) {
				if(i!=y2) {
//					System.out.println(i+" "+y2);
					ans1+=odd.get(i);
				}
			}
			long ans2 = 0;
			for(int i:ks1) {
				if(i!=x2) {
					ans2+=even.get(i);
				}
			}
			for(int i:ks2) {
				if(i!=mn2) {
					ans+=odd.get(i);
				}
			}
			ans = Math.min(ans1,ans2);
		}
		out.write((ans+"\n").getBytes());
		out.close();
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
