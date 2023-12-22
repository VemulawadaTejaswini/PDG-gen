import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int X,Y,Z,K;
	static long[] A,B,C,cakes;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		X=sc.nextInt();
		Y=sc.nextInt();
		Z=sc.nextInt();
		K=sc.nextInt();
		A=new long[X];
		B=new long[Y];
		C=new long[Z];
		for(int i=0; i<X; i++) {
			A[i]=sc.nextLong();
		}
		for(int i=0; i<Y; i++) {
			B[i]=sc.nextLong();
		}
		for(int i=0; i<Z; i++) {
			C[i]=sc.nextLong();
		}
		cakes=new long[X*Y];
		for(int i=0; i<X; i++) {
			for(int j=0; j<Y; j++) {
				cakes[i*Y+j]=A[i]+B[j];
			}
		}
		Arrays.sort(cakes);
		for(int i=1; i<=K; i++) {
			pl(bi(i-1));
		}
	}
	public static long bi(int banme) {
		long max=1000000000002L;
		long min=0;
		int tmp=0;
		int counter=0;
		while(max-min>1) {
			counter=0;
			tmp=0;
			long mid=(max+min)/2;
			for(int i=0; i<Z; i++) {
				tmp=lowerBound(cakes,mid-C[i]+1);
				if(tmp==-1) {
					//pl("!");
					tmp=X*Y;
				}
				counter+=tmp;
				//pl(mid+" "+tmp);
			}
			if(counter>=X*Y*Z-banme) {	//でかすぎるとき
				max=mid;
			}
			else {
				min=mid;
			}
		}
		counter=0;
		for(int i=0; i<Z; i++) {
			tmp=lowerBound(cakes,min-C[i]+1);
			if(tmp==-1) {
				tmp=Z;
			}
			counter+=tmp;
		}
		//pl(banme+" "+max+" "+min);
		if(counter==X*Y*Z-banme) {
			return min;
		}
		else {
			return max;
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
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static final int lowerBound(final long[] arr, final long value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid =(high+low)/2;
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
}