

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) {
		FastScanner scanner=new FastScanner();
		int n=scanner.nextInt();
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++) al.add(scanner.nextInt());
		
		if(n==1) System.out.println(al.get(0));
		else {
			long x=0,y=0;
			int l=0,r=n-1;
			boolean b=true;
			while(al.size()>2) {
				//System.out.println(al+" "+l+" "+r);
				int temp;
				if(al.get(l)-al.get(l+1)>al.get(r)-al.get(r-1)) {
					temp=al.get(l);
					al.remove(l);
					
				}
				else {
					temp=al.get(r);
					al.remove(r);
					
				}
				l=0;
				r=al.size()-1;
				if(b) {
					x+=temp;
					b=false;
				}
				else {
					y+=temp;
					b=true;
				}
				
			}
			//System.out.println(al);
			///System.out.println(x+" "+y);
			if(b) {
				x+=Math.max(al.get(0), al.get(1));
				y+=Math.min(al.get(0), al.get(1));
			}
			else  {
				y+=Math.max(al.get(0), al.get(1));
				x+=Math.min(al.get(0), al.get(1));
			}
			long ans=x-y;
			//ans+=Math.abs(-al.get(1));
		System.out.println(ans);
		}
		

		
		

	}
	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDoubel() {
			return Double.parseDouble(next());
		}
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}

