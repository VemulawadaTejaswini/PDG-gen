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
		long MOD=1_000_000_007L;
		StringBuilder sb=new StringBuilder();
		long[][] dp=new long[N][9];
		for(int i=0; i<N; i++) {
			for(int j=0; j<9; j++) {
				dp[i][j]=0;
			}
		}
		/* dp0  RR
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
				i++;
			}
		}
		stat=sb.toString();
		int counter=0;
		if(stat.charAt(0)=='1') {
			dp[0][0]=1;
			dp[0][3]=1;
			dp[0][6]=1;
			counter++;
		}
		else if(stat.charAt(0)=='2'){
			dp[0][1]=1;
			dp[0][2]=1;
			dp[0][4]=1;
			dp[0][5]=1;
			dp[0][7]=1;
			dp[0][8]=1;
			counter++;
		}
		while(counter<stat.length()) {
			if(stat.charAt(counter)=='1') {
				if(stat.charAt(counter-1)=='1') {
					dp[counter][0]=dp[counter-1][3]+dp[counter-1][6];
					dp[counter][3]=dp[counter-1][0]+dp[counter-1][6];
					dp[counter][6]=dp[counter-1][0]+dp[counter-1][3];
					for(int j=0; j<9; j++) {
						dp[counter][j]%=MOD;
					}
					counter++;
				}
				else if(stat.charAt(counter-1)=='2') {
					dp[counter][0]=dp[counter-1][5]+dp[counter-1][8];
					dp[counter][3]=dp[counter-1][2]+dp[counter-1][7];
					dp[counter][6]=dp[counter-1][1]+dp[counter-1][4];
					for(int j=0; j<9; j++) {
						dp[counter][j]%=MOD;
					}
					counter++;
				}
			}
			else if(stat.charAt(counter)=='2') {
				if(stat.charAt(counter-1)=='1') {
					dp[counter][1]=dp[counter-1][6];
					dp[counter][2]=dp[counter-1][3];
					dp[counter][4]=dp[counter-1][6];
					dp[counter][5]=dp[counter-1][0];
					dp[counter][7]=dp[counter-1][3];
					dp[counter][8]=dp[counter-1][0];
					for(int j=0; j<9; j++) {
						dp[counter][j]%=MOD;
					}
					counter++;
				}
				else if(stat.charAt(counter-1)=='2') {
					dp[counter][1]=dp[counter-1][7]+dp[counter-1][4]+dp[counter-1][5];
					dp[counter][2]=dp[counter-1][4]+dp[counter-1][7]+dp[counter-1][8];
					dp[counter][4]=dp[counter-1][8]+dp[counter-1][1]+dp[counter-1][2];
					dp[counter][5]=dp[counter-1][1]+dp[counter-1][8]+dp[counter-1][7];
					dp[counter][7]=dp[counter-1][5]+dp[counter-1][2]+dp[counter-1][1];
					dp[counter][8]=dp[counter-1][2]+dp[counter-1][5]+dp[counter-1][4];
					for(int j=0; j<9; j++) {
						dp[counter][j]%=MOD;
					}
					counter++;
				}
			}
		}
		long ans=0;
		for(int i=0; i<9; i++) {
			ans+=dp[stat.length()-1][i];
		}
		pl((ans%MOD));
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