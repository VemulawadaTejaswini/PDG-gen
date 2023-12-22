import java.util.*;
import java.io.*;

public class Main {
	static boolean xminus, yminus, xyswap;
	static List<int[]> ans = new ArrayList<>();
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int K = fs.nextInt(), X = fs.nextInt(), Y = fs.nextInt();
		//前処理
		if(X<0) {
			X = -X;
			xminus = true;
		}
		if(Y<0) {
			Y = -Y;
			yminus = true;
		}
		if(X<Y) {
			int tmp = X;
			X = Y;
			Y = tmp;
			xyswap = true;
		}
		
		//本処理
		if(K%2==0&& (X + Y)%2==1) {
			System.out.println(-1);
			return;
		}
		
		if(K%2==1) {
			if(X + Y > K) {
				int n = (X + Y + K - 1)/ K; 
				if((X + Y)%2 != n%2)n++; 	
				int rem = n*K - (X+Y);
				int ydist = Y + rem/2;
				while(ydist > K) {
					ydist -= K;
					addans(0,K);
				}
				addans(K - ydist, ydist);
				int xdist = X - (K - ydist);
				while(xdist > K) {
					xdist -= K;
					addans(K,0);
				}
				addans(xdist, -(K-xdist));
			}
			else if(X + Y == K) {
				addans(X,Y);
			}
			else {
				//3回でたどり着ける
				if((X + Y) % 2==1) {
					addans(X, K-X); 
					int halfremY = (K - (X + Y))/2;
					addans(K - halfremY, -halfremY);
					addans(- (K - halfremY), -halfremY);
				}
				//2回でたどり着ける X + Y % 2 == 0
				else {
					int rem = 2 * K - (X + Y);
					addans(K - (rem/2 + Y), rem/2 + Y);
					addans(X - (K - (rem/2 + Y)), -rem/2);
				}
			}
		}
		//Kが偶数 かつ　X + Y が偶数　**ほとんどKが奇数の時のコピペ
		else {
			if(X + Y > K) {
				int n = (X + Y + K - 1)/ K; 	
				int rem = n*K - (X+Y);
				int ydist = Y + rem/2;
				while(ydist > K) {
					ydist -= K;
					addans(0,K);
				}
				addans(K - ydist, ydist);
				int xdist = X - (K - ydist);
				while(xdist > K) {
					xdist -= K;
					addans(K,0);
				}
				addans(xdist, -(K-xdist));
			}
			else if(X + Y == K) {
				addans(X,Y);
			}
			else {
				//2回でたどり着ける
				int rem = 2 * K - (X + Y);
				addans(K - (rem/2 + Y), rem/2 + Y);
				addans(X - (K - (rem/2 + Y)), -rem/2);	
			}
		}
		printAns();
	}

	static void addans(int x, int y) {
		int t[] = {x, y};
		ans.add(t);
	}
	
	static void printAns() {
		int N = ans.size();
		if(xyswap) {
			for(int i=0;i<N;i++) {
				int tmp = ans.get(i)[0];
				ans.get(i)[0] = ans.get(i)[1];
				ans.get(i)[1] = tmp;
			}
		}
		if(xminus) {
			for(int i=0;i<N;i++) {
				ans.get(i)[0] *= -1;
			}
		}
		if(yminus) {
			for(int i=0;i<N;i++) {
				ans.get(i)[1] *= -1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(N + "\n");
		for(int t[]:ans) {
			sb.append(t[0] + " " + t[1] + "\n");
		}
		System.out.println(sb.toString());
	}
}





//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}