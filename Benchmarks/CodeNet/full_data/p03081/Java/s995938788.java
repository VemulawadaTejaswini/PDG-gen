import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	static String s;
	static int N,Q;
	static int[][] move;
	static int[] place;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		N=sc.nextInt();
		Q=sc.nextInt();
		s=sc.next();
		move=new int[Q][2];
		place=new int[N];
		for(int i=0; i<N; i++) {
			place[i]=s.charAt(i)-'A';
		}
		for(int i=0; i<Q; i++) {
			move[i][0]=((sc.next()).charAt(0))-'A';
			move[i][1]=0;
			String tmp=sc.next();
			if(tmp.charAt(0)=='L') {
				move[i][1]=-1;
			}
			else if(tmp.charAt(0)=='R') {
				move[i][1]=1;
			}
		}
		int MIGI=0;
		int HIDARI=0;
		int min=0;
		int max=N;
		while(max-min>1) {	//二分探索でどこまで落ちるかを考える	→
			int mid=(max+min)/2;
			boolean totatu=migi(mid);
			if(totatu) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		boolean minok=migi(min);
		boolean maxok=migi(max);
		if(minok) {
			MIGI=min;
		}
		else if(maxok) {
			MIGI=max;
		}
		else {
			MIGI=-1;
		}

		min=0;
		max=N;
		while(max-min>1) {
			int mid=(max+min)/2;
			boolean totatu=hidari(mid);
			if(totatu) {
				min=mid;
			}
			else {
				max=mid;
			}
		}
		minok=hidari(min);
		maxok=hidari(max);
		if(maxok) {
			HIDARI=max;
		}
		else if(minok) {
			HIDARI=min;
		}
		else {
			HIDARI=-1;
		}
		int ans=N;
		if(MIGI>=0) {
			ans-=(N-MIGI);
		}
		if(HIDARI>=0) {
			ans-=(HIDARI+1);
		}
		pl(ans);
	}
	static boolean migi(int mid) {
		int now=mid;
		if(mid==N) {
			return true;
		}
		else {
			for(int i=0; i<Q; i++) {
				if(move[i][0]==place[now]) {
					if(move[i][1]==1) {
						now++;
					}
					else if(move[i][1]==-1) {
						now--;
					}
				}
				if(now==N) {
					return true;
				}
				else if(now<0) {
					return false;
				}
			}
			return false;
		}
	}

	static boolean hidari(int mid) {
		int now=mid;
		if(mid==N) {
			return true;
		}
		else {
			for(int i=0; i<Q; i++) {
				if(move[i][0]==place[now]) {
					if(move[i][1]==1) {
						now++;
					}
					else if(move[i][1]==-1) {
						now--;
					}
				}
				if(now<0) {
					return true;
				}
				else if(now>=N) {
					return false;
				}
			}
			return false;
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