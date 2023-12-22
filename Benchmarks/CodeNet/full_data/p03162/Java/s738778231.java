import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static int last;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();//1日目から最大を取っていくのはありがちな貪欲の嘘解法っぽい
		int[][] vc=new int[N][3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				vc[i][j]=sc.nextInt();
			}
		}
		last=-1;
		int max1=vc[0][0];
		last=0;
		for(int i=1; i<N; i++) {
			max1+=at(vc[i][0],vc[i][1],vc[i][2]);
		}
		int max2=vc[0][1];
		last=1;
		for(int i=1; i<N; i++) {
			max2+=at(vc[i][0],vc[i][1],vc[i][2]);
		}
		int max3=vc[0][2];
		last=2;
		for(int i=1; i<N; i++) {
			max3+=at(vc[i][0],vc[i][1],vc[i][2]);
		}
		pl(Math.max(Math.max(max1, max2),Math.max(max2, max3)));
	}
	public static int at(int a,int b,int c) {
		int[][] ar=new int[3][2];
		ar[0][0]=a;
		ar[0][1]=0;
		ar[1][0]=b;
		ar[1][1]=1;
		ar[2][0]=c;
		ar[2][1]=2;
		quick_sort(ar,0,2);
		if(ar[2][1]==last) {
			last=ar[1][1];
			return ar[1][0];
		}
		else {
			last=ar[2][1];
			return ar[2][0];
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
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
	static void quick_sort(int[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2][0];
		int l = left, r = right;
		int tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}