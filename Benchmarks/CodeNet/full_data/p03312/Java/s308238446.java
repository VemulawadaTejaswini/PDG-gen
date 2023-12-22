import java.io.*;
import java.util.*;

public class Main{

	static int []a;
	static long []prefix;
	static long []prefix(int idx){
		int last=0;
		long total=prefix[idx];
		int lo=0,hi=idx-1;
		while(lo<=hi) {
			int mid=lo+hi>>1;
			long s1=prefix[mid],s2=total-prefix[mid];
			if(s1<=s2) {
				last=mid;
				lo=mid+1;
			}
			else
				hi=mid-1;
		}
		long s1=prefix[last],s2=total-prefix[last];
		long s11=s1+a[last+1],s22=s2-a[last+1];
		return Math.abs(s2-s1)<Math.abs(s22-s11)?new long [] {s1,s2}:new long [] {s11,s22};
		
	}
	static long []suffix(int idx){
		int last=idx;
		long total=prefix[prefix.length-1]-prefix[idx-1];
		int lo=idx,hi=prefix.length-2;
		while(lo<=hi) {
			int mid=lo+hi>>1;
			long s1=prefix[mid]-prefix[idx-1],s2=total-(prefix[mid]-prefix[idx-1]);
			if(s1<=s2) {
				last=mid;
				lo=mid+1;
			}
			else
				hi=mid-1;
		}
		long s1=prefix[last]-prefix[idx-1],s2=total-(prefix[last]-prefix[idx-1]);
		long s11=s1+a[last+1],s22=s2-a[last+1];
		return Math.abs(s2-s1)<Math.abs(s22-s11)?new long [] {s1,s2}:new long [] {s11,s22};
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		a=new int [n];
		prefix=new long [n];
		for(int i=0;i<n;i++) {
			prefix[i]+=a[i]=sc.nextInt();
			if(i>0)
				prefix[i]+=prefix[i-1];
		}
		long ans=prefix[n-1];
		for(int middle=1;middle<n-2;middle++) {
			long []pre=prefix(middle);
			long []suf=suffix(middle+1);
			Arrays.sort(pre);
			Arrays.sort(suf);
			
			long max=Math.max(pre[1], suf[1]);
			long min=Math.min(suf[0], pre[0]);
			ans=Math.min(ans, max-min);
		}
		out.println(ans);
		out.close();
	}
	
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}