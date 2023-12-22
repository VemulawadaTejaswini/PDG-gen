
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String s=sc.next();
		char[] key= {'k','e','y','e','n','c','e'};
		int[] ban= {0,0,0,0,0,0,0};
		int ptr=0;
		for(int i=0; i<s.length(); i++) {
			if(ptr<7 && s.charAt(i)==key[ptr]) {
				ban[ptr]=i+1;
				ptr++;
			}
		}
		boolean ititobi=false;
		if(ptr!=7) {
			pl("NO");
			System.exit(0);
		}
		for(int i=1; i<7; i++) {
			if(ban[i]-ban[i-1]>1 && !ititobi) {
				ititobi=true;
			}
			else if(ititobi && ban[i]-ban[i-1]>1) {
				pl("NO");
				System.exit(0);
			}
		}
		pl("YES");
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}