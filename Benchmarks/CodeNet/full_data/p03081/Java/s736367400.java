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
		int Q=sc.nextInt();
		String s=sc.next();
		int[][] move=new int[Q][2];
		int[] place=new int[N];
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
		int min=0;
		int max=N;
		while(max-min>1) {	//二分探索でどこまで落ちるかを考える	→
			int mid=(max+min)/2;
			boolean totatu=false;
			int now=mid;
			for(int i=0; i<Q; i++) {
				if(move[i][0]==place[now]) {
					if(move[i][1]==1) {
						now++;
					}
					else if(move[i][1]==-1) {
						now--;
					}
				}
				if(now>=N) {
					totatu=true;
					break;
				}
				else if(now<0) {
					totatu=false;
					break;
				}
				else if(i==Q-1 && (0<=now && now<N)) {
					totatu=false;
					break;
				}
			}
			if(totatu) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		//上限下限

		int jikken=min;//より左側にあるもの
		int mg=0;
		for(int i=0; i<Q; i++) {
			if(move[i][0]==place[jikken]) {
				if(move[i][1]==1) {
					jikken++;
				}
				else if(move[i][1]==-1) {
					jikken--;
				}
			}
			if(jikken>=N) {
				mg=min;
			}
			else if(jikken<0) {
				int tmpj=max;
				if(tmpj==N) {
					mg=-1;
				}
				else {
					for(int k=0; k<Q; k++) {
						if(move[k][0]==place[tmpj])
						{
							if(move[k][1]==1) {
								tmpj++;
							}
							else if(move[k][1]==-1) {
								tmpj--;
							}
						}
						if(tmpj<0) {
							mg=-1;
							break;
						}
						else if(tmpj>=N) {
							mg=max;
							break;
						}
						else if(k==Q-1) {
							mg=-1;
							break;
						}
					}
				}
			}
			else if(i==Q-1 && (0<=jikken && jikken<N)) {
				mg=max;
			}
		}

		int min1=0;
		int max1=N;
		while(max1-min1>1) {	//二分探索でどこまで落ちるかを考える	←
			int mid=(max1+min1)/2;
			boolean totatu=false;
			int now=mid;
			for(int i=0; i<Q; i++) {
				if(move[i][0]==place[now]) {
					if(move[i][1]==1) {
						now++;
					}
					else if(move[i][1]==-1) {
						now--;
					}
				}
				if(now>=N) {
					totatu=false;
					break;
				}
				else if(now<0) {
					totatu=true;
					break;
				}
				else if(i==Q-1 && (0<=now && now<N)) {
					totatu=false;
					break;
				}
			}
			if(totatu) {
				min1=mid;
			}
			else {
				max1=mid;
			}
		}
		int jikken2=max1;//より右側にあるもの
		int hdr=-1;
		if(max1==N) {
			hdr=N-1;
		}
		else {
			for(int i=0; i<Q; i++) {
				if(move[i][0]==place[jikken2]) {
					if(move[i][1]==1) {
						jikken2++;
					}
					else if(move[i][1]==-1) {
						jikken2--;
					}
				}
				if(jikken2>=N) {
					int tmpj=min1;
					for(int k=0; k<Q; k++) {
						if(move[k][0]==place[tmpj])
						{
							if(move[k][1]==1) {
								tmpj++;
							}
							else if(move[k][1]==-1) {
								tmpj--;
							}
						}
						if(tmpj>=N) {
							hdr=-1;
							break;
						}
						else if(tmpj<0) {
							hdr=min1;
							break;
						}
						else if(k==Q-1) {
							hdr=-1;
							break;
						}
					}
				}
				else if(jikken2<0) {
					hdr=max1;
				}
				else if(i==Q-1 && (0<=jikken2 && jikken2<N)) {
					hdr=min1;
				}
			}
		}

		int ans=N;
		if(mg>=0) {
			ans-=(N-mg);
		}
		if(hdr>=0) {
			ans-=(hdr+1);
		}
		if(ans>=0) {
			pl(ans);
		}
		else {
			pl(0);
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