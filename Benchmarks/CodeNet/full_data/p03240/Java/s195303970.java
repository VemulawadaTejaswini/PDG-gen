
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();

		long minH = Integer.MAX_VALUE;
		ArrayList<Toi> toiList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Toi toi = new Toi(sc.nextInt(), sc.nextInt(), sc.nextLong());
			toiList.add(toi);
			minH = Math.min(minH, toi.h);
		}

		Queue<Toi> res = new ArrayDeque<>();
		for (long i = minH; i <= minH + 200; i++) {
			for (int x = 0; x <= 100; x++) {
				for (int y = 0; y <= 100; y++) {
					res.add(new Toi(x, y, i));
				}
			}
		}

		while (1 < res.size()) {
			for (Toi toi : toiList) {
				Toi ans = res.poll();
				if (toi.h == ans.h - Math.abs(ans.x - toi.x) - Math.abs(ans.y - toi.y)) {
					res.add(ans);
				}
			}
		}
		Toi ans = res.poll();
		out.println(ans.x +" "+ans.y+" "+ans.h);
		out.flush();

	}

	static class Toi {
		public int x;
		public int y;
		public long h;

		public Toi(int x, int y, long h) {
			this.x = x;
			this.y = y;
			this.h = h;
		}

		@Override
		public boolean equals(Object obj){
			if(obj == null){
				return false;
			}

			if(this == obj){
				return true;
			}

			if(this.getClass() != obj.getClass()){
				return false;
			}

			Toi toi = (Toi)obj;
			return x == toi.x && y == toi.y && h == toi.h;
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
