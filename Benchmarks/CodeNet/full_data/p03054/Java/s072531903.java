import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int r = fs.nextInt(), c = fs.nextInt();
		int n = fs.nextInt();
		int x = fs.nextInt(), y = fs.nextInt();
		char[] taka = fs.next().toCharArray();
		char[] aoki = fs.next().toCharArray();
		char[] map = new char[256];
		map['L'] = 1; map['R'] = 2; map['U'] = 3; map['D'] = 4;
		int[] dy = {-1, 1, 0, 0};
		int[] dx = {0, 0, -1, 1};
		boolean good = false;
		for(int move = 1; move <= 4 && !good; move++) {
			int curX = x, curY = y;
			for(int i = 0; i < n; i++) {
				if(map[taka[i]] == move) {
					curX += dx[map[taka[i]]-1];
					curY += dy[map[taka[i]]-1];
				}
				int his = map[taka[i]]-1;
				if(his+1 == move && ((map[aoki[i]]-1)^1) == his) {
					curX += dx[map[aoki[i]]-1];
					curY += dy[map[aoki[i]]-1];
				}
				if(curX < 1 || curY < 1 || curX > r || curY > c) {
					good = true;
					break;
				}
			}
		}
		if(!good) out.println("YES");
		else out.println("NO");
		
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