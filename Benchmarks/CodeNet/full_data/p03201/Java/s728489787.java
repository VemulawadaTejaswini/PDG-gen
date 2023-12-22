import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		long[][] ar=new long[N][2];
		for(int i=0; i<N; i++) {
			ar[i][0]=sc.nextInt();
			ar[i][1]=0;
		}
		quick_sort(ar,0,N-1);
		int  kosu=0;
		for(int i=0; i<N; i++) {
			if(ar[N-1-i][1]==0) {
				long a=ar[N-1-i][0];
				long k=unko(a)-a;
				int aa=bS(k,ar);
				if(aa>=0 && ar[aa][1]==0) {
					kosu++;
					ar[N-i-1][1]++;
					ar[aa][1]++;
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
	static long unko(long a) {
		int k=0;
		long b=a;
		while(b>0) {
			k++;
			b/=2;
		}
		long aaa=1;
		for(int i=0; i<k; i++) {
			aaa*=2;
		}
		if(aaa>=2*a) {
			aaa=a;
		}
		return aaa;
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left;
		int r = right;
		long tmp;
		long tmp1;
		long tmp2;
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
	static int bS(long n, long[][] ary){
		int low = 0;
		int high = ary.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (n == ary[mid][0])
				return mid;
			else if (n > ary[mid][0])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}



/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class GB29{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		ArrayList<Integer> unko=new ArrayList<Integer>();
		int N=sc.nextInt();
		for(int i=0; i<N; i++) {
			unko.add(sc.nextInt());
		}
		Collections.sort(unko);
		int kosu=0;
		while(true){
			int a=unko.get(unko.size()-1);
			int max=unko(a);
			int hosu=max-a;
			int ban=unko.indexOf(hosu);
			if(ban>=0) {
				kosu++;
				unko.remove(unko.size()-1);
				unko.remove(ban);
			}
			else {
				unko.remove(unko.size()-1);
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
		if(aaa>=2*a) {
			aaa=a;
		}
		return aaa;
	}
}
*/