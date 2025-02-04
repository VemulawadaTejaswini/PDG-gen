import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[] ary=new long[N];
		for(int i=0; i<N; i++) {
			ary[i]=sc.nextLong()*2;
		}
		Arrays.sort(ary);
		int kosu=0;
		for(int i=N-1; i>=0; i--) {
			if(ary[i]%2!=1) {
				int a=lowerBound(ary,solve_pair(ary[i]));
				//System.out.println(a+" "+solve_pair(ary[i]));
				if(a==-1) {
					//
				}
				else if(a>=0 && ary[a]==solve_pair(ary[i]) && i!=a) {
					kosu++;
					ary[a]--;
					ary[i]--;
				}
				else {
					ary[i]--;
				}
			}
			else {
				//
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
	public static final int lowerBound(final long[] arr, final long value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (arr[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
		}
	}
	static long solve_pair(long a) {
		int k=0;
		long b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		int aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		return (aaa-a);
	}
}