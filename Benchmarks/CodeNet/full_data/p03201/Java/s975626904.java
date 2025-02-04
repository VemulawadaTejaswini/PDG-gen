import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		TreeSet<Integer> unko=new TreeSet<>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			unko.add(sc.nextInt());
		}
		int kosu=0;
		while(true){
			//System.out.println(unko.toString());
			int a=unko.pollLast();
			int max=unko(a);
			int hosu=max-a;
			if(unko.remove(hosu)) {
					kosu++;
			}
			if(unko.size()==0) {
				break;
			}
		}
		System.out.println(kosu);
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
	static int unko(int a) {
		int k=0;
		int b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		int aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		return aaa;
	}
}
