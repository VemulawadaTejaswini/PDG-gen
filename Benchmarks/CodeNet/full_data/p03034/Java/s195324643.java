import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int N = fs.nextInt();
		int[] a = fs.nextIntArray(N);
		long res = a[0]+a[N-1];
		int[] used = new int[N];
		for(int diff = 1; diff <= N; diff++) {
			long last = a[0]+a[N-1];
			for(int k = 1; k <= N; k++) {
				if((long)k*diff > N-1) break;
				int val = k*diff;
				int A = N-1 - val;
				if(A <= 0 || A == diff) break;
				if(used[A] == diff || used[N-1-A] == diff) break;
				if(diff<k) break;
				used[A] = diff;
				used[N-1-A] = diff;
				long add = a[A];
				add += a[N-1-A];
				last += add;
				res = Math.max(res, last);
			}
		}
		out.println(res);

		//		{
		//			int use = 11;
		//			for(int N = use; N <= use; N++) {
		//				System.out.println("For N = " + N);
		//				for(int C = 1; C <= N; C++) {
		//					for(int k = 0; k <= N; k++) {
		//						int val = k*C;
		//						if(val > N-1) break;
		//						int A = (N-1)-val;
		//						if(A <= 0 /*|| A == val*/) break;
		//
		//						boolean[] reach = new boolean[N];
		//						int mask = 0;
		//						int cur = 0;
		//						boolean bad = false;
		//						while(true) {
		//							reach[cur] = true;
		//							mask |= 1<<cur;
		//							int next = cur+A;
		//							if(next > N-1 || reach[next]) {
		//								bad = true;
		//								break;
		//							}
		//							reach[next] = true;
		//							mask |= 1 << next;
		//							if(next == N-1) break;
		//							next = cur+C;
		//							if(next < 0 || reach[next]) {
		//								bad = true;
		//								break;
		//							}
		//							cur = next;
		//							mask |= 1 <<next;
		//						}
		//						if(!bad) {
		//							System.out.println(C + " " + k + " " + (k*C) + " " + (A%10) + " " + Integer.toBinaryString(mask));
		//						}
		//					}
		//					System.out.println();
		//				}
		//			}
		//		}

		out.close();
	}

	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}

	}

}