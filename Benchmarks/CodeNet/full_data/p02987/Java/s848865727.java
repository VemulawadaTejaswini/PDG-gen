
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;





public class Main {

	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long)(1e9+7);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		Set<Character> set = new HashSet<>();
		char[] ch = sc.next().toCharArray();
		for(int i=0;i<ch.length;++i) set.add(ch[i]);
		if(set.size() == 2) out.println("Yes");
		else out.print("No");
		out.close();
		 
	}
	static int l,r,x,ans;
	private static void solve(int[] a, int n,List<Integer> list) {
	
		//out.println(list);
		if(list.size() == n) {
			
			long sum = 0;
			int ctr = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
			for(int i=0;i<list.size();++i) {
				ctr+=list.get(i);
				if(list.get(i) == 1) {
					sum+=a[i];
					min = Math.min(a[i], min);
					max = Math.max(a[i], max);
				}
			}
			//out.println(sum+" "+ctr+" "+max+" "+min+" "+l+" "+r+" "+x);
			if(ctr>1 && sum>=l && sum<=r && max-min>=x) {
				
				++ans;
			}
			
		}else {
		  
		   list.add(0);
		    solve(a,n,list);
		   list.remove(list.size()-1);
		   list.add(1);
		    solve(a,n,list);
		   list.remove(list.size()-1);
		 
	}
	}

}
