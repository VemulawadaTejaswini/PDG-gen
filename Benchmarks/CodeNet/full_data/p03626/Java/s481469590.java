import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		String stat="";
		long MOD=1000000007L;
		StringBuilder sb=new StringBuilder();
		long[][] dp=new long[N][9];
		for(int i=0; i<N; i++) {
			for(int j=0; j<9; j++) {
				dp[i][j]=0;
			}
		}
		int mannaka=0;
		/*
		 * dp0  RR
		 * dp1  RG
		 * dp2  RB
		 * dp3  GG
		 * dp4  GR
		 * dp5  GB
		 * dp6  BB
		 * dp7  BR
		 * dp8  BG
		 */
		String ue=sc.next();
		String st=sc.next();
		for(int i=0; i<N; i++) {
			if(ue.charAt(i)==st.charAt(i)) {
				sb.append(1);
			}
			else {
				sb.append(2);
			}
		}
		stat=sb.toString();
		StringBuilder sbt=new StringBuilder(stat);
		String gyak=(sbt.reverse()).toString();

		if(N==1) {
			pl(3);
			System.exit(0);
		}
		else if(N==2) {
			pl(3);
			System.exit(0);
		}

		if(stat.equals(gyak)) {//パリンドロームのとき、ダブリを引かないといけない
			mannaka=0;
			//中心を決定する
			int tmp=0;
			int moji=stat.length();
			while(true) {
				if(stat.charAt(tmp)=='1') {
					if(tmp+1>=moji/2) {
						//もしもこれを足して中心に到達するなら
						mannaka=tmp+1;
						break;
					}
					else {
						tmp++;
					}
				}
				else if(stat.charAt(tmp)=='2') {
					if(tmp+2>moji/2) {
						//もしもこれを足して中心に到達するなら
						mannaka=tmp;
						break;
					}
					else {
						tmp+=2;
					}
				}
			}
			int counter=0;
			if(stat.charAt(0)=='1') {
				dp[0][0]=1;
				dp[0][3]=1;
				dp[0][6]=1;
				counter++;
			}
			else if(stat.charAt(0)=='2'){
				dp[0][1]=1; dp[1][1]=dp[0][1];
				dp[0][2]=1; dp[1][2]=dp[0][2];
				dp[0][4]=1; dp[1][4]=dp[0][4];
				dp[0][5]=1; dp[1][5]=dp[0][5];
				dp[0][7]=1; dp[1][7]=dp[0][7];
				dp[0][8]=1; dp[1][8]=dp[0][8];
				counter+=2;
			}
			while(counter<N) {
				if(stat.charAt(counter)=='1') {
					if(stat.charAt(counter-1)=='1') {
						dp[counter][0]+=dp[counter-1][3]+dp[counter-1][6];
						dp[counter][3]+=dp[counter-1][0]+dp[counter-1][6];
						dp[counter][6]+=dp[counter-1][0]+dp[counter-1][3];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						counter++;
					}
					else if(stat.charAt(counter-1)=='2') {
						dp[counter][0]+=dp[counter-1][3]+dp[counter-1][5]+dp[counter-1][6]+dp[counter-1][8];
						dp[counter][3]+=dp[counter-1][0]+dp[counter-1][2]+dp[counter-1][6]+dp[counter-1][7];
						dp[counter][6]+=dp[counter-1][0]+dp[counter-1][1]+dp[counter-1][3]+dp[counter-1][4];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						counter++;
					}
				}
				else if(stat.charAt(counter)=='2') {
					if(stat.charAt(counter-1)=='1') {
						dp[counter][1]+=dp[counter-1][6];
						dp[counter][2]+=dp[counter-1][3];
						dp[counter][4]+=dp[counter-1][6];
						dp[counter][5]+=dp[counter-1][0];
						dp[counter][7]+=dp[counter-1][3];
						dp[counter][8]+=dp[counter-1][0];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						for(int j=0; j<9; j++) {
							dp[counter+1][j]=dp[counter][j];
						}
						counter+=2;
					}
					else if(stat.charAt(counter-1)=='2') {
						dp[counter][1]+=dp[counter-1][7]+dp[counter-1][4]+dp[counter-1][5];
						dp[counter][2]+=dp[counter-1][4]+dp[counter-1][7]+dp[counter-1][8];
						dp[counter][4]+=dp[counter-1][8]+dp[counter-1][1]+dp[counter-1][2];
						dp[counter][5]+=dp[counter-1][1]+dp[counter-1][8]+dp[counter-1][7];
						dp[counter][7]+=dp[counter-1][5]+dp[counter-1][2]+dp[counter-1][1];
						dp[counter][8]+=dp[counter-1][2]+dp[counter-1][5]+dp[counter-1][4];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						for(int j=0; j<9; j++) {
							dp[counter+1][j]=dp[counter][j];
						}
						counter+=2;
					}
				}
			}
			long ans=0;
			for(int i=0; i<9; i++) {
				ans+=dp[N-1][i];
			}
			for(int i=0; i<9; i++) {
				ans-=dp[mannaka][i];
			}
			while(ans<0) {
				ans+=MOD;
			}
			pl(ans);
			System.exit(0);
		}
		else {
			int counter=0;
			if(stat.charAt(0)=='1') {
				dp[0][0]=1;
				dp[0][3]=1;
				dp[0][6]=1;
				counter++;
			}
			else if(stat.charAt(0)=='2'){
				dp[0][1]=1; dp[1][1]=dp[0][1];
				dp[0][2]=1; dp[1][2]=dp[0][2];
				dp[0][4]=1; dp[1][4]=dp[0][4];
				dp[0][5]=1; dp[1][5]=dp[0][5];
				dp[0][7]=1; dp[1][7]=dp[0][7];
				dp[0][8]=1; dp[1][8]=dp[0][8];
				counter+=2;
			}
			while(counter<N) {
				if(stat.charAt(counter)=='1') {
					if(stat.charAt(counter-1)=='1') {
						dp[counter][0]+=dp[counter-1][3]+dp[counter-1][6];
						dp[counter][3]+=dp[counter-1][0]+dp[counter-1][6];
						dp[counter][6]+=dp[counter-1][0]+dp[counter-1][3];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						counter++;
					}
					else if(stat.charAt(counter-1)=='2') {
						dp[counter][0]+=dp[counter-1][3]+dp[counter-1][5]+dp[counter-1][6]+dp[counter-1][8];
						dp[counter][3]+=dp[counter-1][0]+dp[counter-1][2]+dp[counter-1][6]+dp[counter-1][7];
						dp[counter][6]+=dp[counter-1][0]+dp[counter-1][1]+dp[counter-1][3]+dp[counter-1][4];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						counter++;
					}
				}
				else if(stat.charAt(counter)=='2') {
					if(stat.charAt(counter-1)=='1') {
						dp[counter][1]+=dp[counter-1][6];
						dp[counter][2]+=dp[counter-1][3];
						dp[counter][4]+=dp[counter-1][6];
						dp[counter][5]+=dp[counter-1][0];
						dp[counter][7]+=dp[counter-1][3];
						dp[counter][8]+=dp[counter-1][0];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						for(int j=0; j<9; j++) {
							dp[counter+1][j]=dp[counter][j];
						}
						counter+=2;
					}
					else if(stat.charAt(counter-1)=='2') {
						dp[counter][1]+=dp[counter-1][7]+dp[counter-1][4]+dp[counter-1][5];
						dp[counter][2]+=dp[counter-1][4]+dp[counter-1][7]+dp[counter-1][8];
						dp[counter][4]+=dp[counter-1][8]+dp[counter-1][1]+dp[counter-1][2];
						dp[counter][5]+=dp[counter-1][1]+dp[counter-1][8]+dp[counter-1][7];
						dp[counter][7]+=dp[counter-1][5]+dp[counter-1][2]+dp[counter-1][1];
						dp[counter][8]+=dp[counter-1][2]+dp[counter-1][5]+dp[counter-1][4];
						for(int j=0; j<9; j++) {
							dp[counter][j]%=MOD;
						}
						for(int j=0; j<9; j++) {
							dp[counter+1][j]=dp[counter][j];
						}
						counter+=2;
					}
				}
			}
		}
		long ans=0;
		for(int i=0; i<9; i++) {
			ans+=dp[N-1][i];
		}
		pl(ans%MOD);
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
}