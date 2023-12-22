import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt();
		int k = fs.nextInt();
		int[] a = fs.nextIntArray(n);
		int val = 0;
		for(int i : a) val += i;
		int res = 1;
		int[] list = new int[n];
		int[] sum = new int[n];
		for(int gcd = 1; gcd*gcd <= val; gcd++) {
			if(val%gcd != 0) continue;
			int[] vs = {gcd, val/gcd};
			for(int j = 0; j < 2; j++) {
				for(int i = 0; i < n; i++) {
					list[i] = a[i]%vs[j];
				}
				Arrays.sort(list);
				for(int i = n-1; i >= 0; i--) {
					sum[i] = vs[j]-list[i];
					if(sum[i] == vs[j]) sum[i] = 0;
					if(i+1 < n) sum[i] += sum[i+1];
				}
				int cur = 0;
				int moves = -1;
				for(int i = 0; i < n-1; i++) {
					cur += list[i];
					if(cur == sum[i+1]) {
						moves = cur;
					}
				}
				if(moves != -1 && moves <= k) {
					res = Math.max(res, vs[j]);
				}
			}
		}
		out.println(res);
			
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