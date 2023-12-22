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
		/*
		 * 見た感じ逆順だなぁ
		 * ダブる数字は小さい方から見ていけばよさそう
		 * （条件を満たせばいいので、条件を満たせるものがあれば満たしていけば良いはず）
		 * 操作は逆順にして、大きい数から見ていけば良さそう
		 * とり方としては、
		 * 与えられた数列aに対し
		 * a_i = i を満たす最大のものを取り除いていく。
		 * 最大でないとどうなるか、 a_i > iとなり満たすはずのものが条件を満たさなくなってしまう
		 * なので、できるだけ条件を満たすように取っていった時、条件を満たさないものが出てきた時、それはできなく、
		 * 最後までできたら、OK
		 */
		ArrayList<Integer> lis=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		int[] sorts=new int[N];
		for(int i=0; i<N; i++) {
			lis.add(sc.nextInt());
		}
		for(int i=N-1; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				if(lis.get(j)==j+1) {
					ans.add(lis.get(j));
					lis.remove(j);
					break;
				}
				else if(lis.get(j)>j+1) {
					pl(-1);
					System.exit(0);
				}
			}
		}
		for(int i=N-1; i>=0; i--) {
			pl(ans.get(i));
		}
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
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}