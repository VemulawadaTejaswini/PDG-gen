import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		ArrayList<String> ao=new ArrayList<String>();	//aおわり
		ArrayList<String> bh=new ArrayList<String>();	//bはじまり
		ArrayList<String> ab=new ArrayList<String>();	//どっちも
		ArrayList<String> no=new ArrayList<String>();	//うえのどちらでもない
		String[] s=new String[N];
		for(int i=0; i<N; i++) {
			s[i]=sc.next();
			if(s[i].charAt(0)=='B' && s[i].charAt(s[i].length()-1)=='A') {
				ab.add(s[i]);
			}
			else if(s[i].charAt(0)=='B') {
				bh.add(s[i]);
			}
			else if(s[i].charAt(s[i].length()-1)=='A') {
				ao.add(s[i]);
			}
			else {
				no.add(s[i]);
			}
		}
		int add=Math.min(bh.size(), ao.size());
		if(ab.size()>0) {
			add+=ab.size()-1;
		}
		if(ab.size()>0 && Math.abs(bh.size()-ao.size())>0) {
			add++;
		}
		int base=0;
		for(int i=0; i<N; i++) {
			int nagasa=s[i].length();
			for(int j=0; j<nagasa-1; j++) {
				if(s[i].charAt(j)=='A' && s[i].charAt(j+1)=='B') {
					base++;
				}
			}
		}
		pl(base+add);
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
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
}