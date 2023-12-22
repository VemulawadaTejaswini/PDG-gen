import java.io.*;
import java.util.*;

public class Main{


	static int A,B,C;
	static int []l;
	static int INF=(int)1e9;
	static int solve(int msk,int a,int b,int c,int numa,int numb,int numc) {
		if(msk==0) {
			if(numa==0 || numb==0 || numc==0)
				return INF;
			return (numa-1)*10+(numb-1)*10+(numc-1)*10+Math.abs(A-a)+Math.abs(C-c)+Math.abs(B-b);
			
		}
		int z=msk&-msk;
		int idx=(int) (Math.log(z)/Math.log(2));
		msk=msk-(msk&-msk);
		int x=l[idx];
		int ans=solve(msk,a,b,c,numa,numb,numc);
		ans=Math.min(ans, solve(msk,a+x,b,c,numa+1,numb,numc));
		ans=Math.min(ans, solve(msk,a,b+x,c,numa,numb+1,numc));
		ans=Math.min(ans, solve(msk,a,b,c+x,numa,numb,numc+1));
		return ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		l=new int [n];
		for(int i=0;i<n;i++)
			l[i]=sc.nextInt();
		out.println(solve((1<<n)-1, 0, 0, 0, 0, 0, 0));
		
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
