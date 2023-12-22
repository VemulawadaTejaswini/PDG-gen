import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner();
		int n=sc.nextInt();
		int maxN=(int) (1e5+5);
		int [][]f=new int [2][maxN];
		for(int i=0;i<n;i++)
			f[i%2][sc.nextInt()]++;
		int ans=n;
		ArrayList<Integer> []sorted=new ArrayList[2];
		for(int i=0;i<2;i++)
		{
			sorted[i]=new ArrayList();
			for(int j=0;j<maxN;j++)
				sorted[i].add(j);
			int z=i;
			Collections.sort(sorted[i], (a,b)->f[z][b]-f[z][a]);
		}
		for(int t1=0;t1<2;t1++)
			for(int t2=0;t2<2;t2++)
			{
				int a=sorted[0].get(t1),b=sorted[1].get(t2);
				if(a==b)
					continue;
				ans=Math.min(ans, n-f[0][a]-f[1][b]);
			}
		out.println(ans);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String f) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(f));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		double nextDobule() throws IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			return br.readLine();
		}
	}
}
