import java.io.*;
import java.util.*;

public class Main{
	static int n,m;
	static boolean allMatchings(int idx,int[]match,boolean odd) {
		//match holds that column i should be matched with column match[i]
		if(idx==m) {
			return check(match);
		}
		if(match[idx]!=-1) {
			return allMatchings(idx+1, match,odd);
		}
		boolean ans=false;
		for(int j=idx+(odd?0:1);j<m && !ans;j++) {
			if(match[j]==-1) {
				int[]tmp=match.clone();
				tmp[idx]=j;
				tmp[j]=idx;
				ans|=allMatchings(idx+1, tmp,idx==j?false:odd);
			}
		}
		return ans;
	}
	static boolean check(int[]match) {
		boolean[]done=new boolean[n];
		boolean odd=(n%2==1);
		for(int i=0;i<n;i++) {
			if(done[i])continue;
			int matchRow=-1;
			for(int j=n-1;j>=i+(odd?0:1);j--) {
				if(done[j])continue;
				boolean matched=true;
				for(int idx=0;idx<m;idx++) {
					if(in[i][idx]!=in[j][match[idx]]) {
						matched=false;
						break;
					}
				}
				if(matched) {
					if(j==i) {
						odd=false;
					}
					matchRow=j;
					break;
				}
			}
			if(matchRow==-1) {
				return false;
			}
			done[i]=true;
			done[matchRow]=true;
		}
		return true;
	}
	static char[][]in;
	static void main() throws Exception{
		n=sc.nextInt();
		m=sc.nextInt();
		in=new char[n][];
		for(int i=0;i<n;i++)in[i]=sc.nextLine().toCharArray();
		int[]match=new int[m];
		Arrays.fill(match, -1);
		pw.println(allMatchings(0, match,m%2==1)?"YES":"NO");
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
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
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public long[] longArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]inArr=new Integer[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]inArr=new Long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
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
	static void shuffle(int[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			int tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(long[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			long tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(String[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			String tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
}