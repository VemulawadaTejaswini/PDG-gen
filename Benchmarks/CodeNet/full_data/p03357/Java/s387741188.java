import java.io.*;
import java.util.*;

public class Main{
	static int[][]in,cntGreaterBefore,pos,cntGreaterDifColor[];
	static int[][]memo;
	static int n;
	static int dp(int maxInColor0,int maxInColor1) {
		if(maxInColor0<0 || maxInColor1<0)return (int)1e8;
		if(maxInColor0==0 && maxInColor1==0)return 0;
		if(memo[maxInColor0][maxInColor1]!=-1)return memo[maxInColor0][maxInColor1];
		
		int shifted0=n-maxInColor0,shifted1=n-maxInColor1;
		int shifted=shifted0+shifted1;
		
		int pos0=pos[maxInColor0][0]-cntGreaterBefore[maxInColor0][0]-cntGreaterDifColor[maxInColor0][0][maxInColor1];
		int pos1=pos[maxInColor1][1]-cntGreaterBefore[maxInColor1][1]-cntGreaterDifColor[maxInColor1][1][maxInColor0];
		
		int shiftMaxColor0=((n<<1)-1-shifted-pos0)+dp(maxInColor0-1, maxInColor1);
		int shiftMaxColor1=((n<<1)-1-shifted-pos1)+dp(maxInColor0, maxInColor1-1);
		
//		if(maxInColor0==2 && maxInColor1==0) {
//			System.out.println(shifted+" "+pos0+" "+cntGreaterDifColor[maxInColor0][0][maxInColor1]);
//			System.out.println(((n<<1)-1-shifted-pos0));
//		}
		return memo[maxInColor0][maxInColor1]=Math.min(shiftMaxColor0, shiftMaxColor1);
	}
	static void main() throws Exception{
		n=sc.nextInt();
		in=new int[n<<1][2];
		for(int i=0;i<n<<1;i++) {
			in[i]=new int[] {sc.nextChar()=='B'?0:1,sc.nextInt()};
		}
		pos=new int[n+1][2];
		cntGreaterBefore=new int[n+1][2];
		cntGreaterDifColor=new int[n+1][2][n+1];
		for(int i=0;i<n<<1;i++) {
			int curColor=in[i][0],curVal=in[i][1];
			pos[curVal][curColor]=i;
			cntGreaterBefore[curVal][curColor]=0;
			for(int j=i-1;j>=0;j--) {
				if(in[j][0]==curColor && in[j][1]>curVal) {
					cntGreaterBefore[curVal][curColor]++;
				}
			}
		}
		for(int i=0;i<n<<1;i++) {
			int[]pref=new int[n<<1|1];
			int curColor=in[i][0],curVal=in[i][1];
			for(int j=0;j<n<<1;j++) {
				if(in[j][0]==curColor && in[j][1]>curVal) {
					pref[j+1]++;
				}
			}
			for(int j=1;j<pref.length;j++) {
				pref[j]+=pref[j-1];
			}
			for(int j=0;j<n<<1;j++) {
				if(in[j][0]!=curColor) {
					//count how many balls before (ball j) with same color of (ball i) and value greater than (ball i)
					cntGreaterDifColor[in[j][1]][in[j][0]][curVal]=pref[j];
				}
			}
			
		}
		int[]cnt=new int[2];
		for(int i=0;i<n<<1;i++) {
			int curColor=in[i][0],curVal=in[i][1];
			cnt[curColor]++;
			cntGreaterDifColor[curVal][curColor][0]=cnt[1-curColor];
		}
		
		memo=new int[n+1][n+1];
		for(int[]i:memo)Arrays.fill(i, -1);
		pw.println(dp(n, n));
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
//		int tc=sc.nextInt();
//		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
