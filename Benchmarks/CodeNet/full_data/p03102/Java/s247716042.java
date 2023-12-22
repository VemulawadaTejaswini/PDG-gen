import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt(),c=sc.nextInt();
		int []b=new int [m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		int ans=0;
		while(n-->0) {
			int x=c;
			for(int i=0;i<m;i++)
				x+=sc.nextInt()*b[i];
			if(x>0)
				ans++;
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
