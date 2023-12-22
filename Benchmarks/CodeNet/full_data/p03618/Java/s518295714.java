import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		String s=sc.next();
		int n=s.length();
		int [] c=new int [26];
		for(int i=0;i<n;i++)
			c[s.charAt(i)-'a']++;
		long ans=1;
		for(int i=0;i<n;i++){
			c[s.charAt(i)-'a']--;
			int t=0;
			for(int j=0;j<26;j++)
				if(j!=s.charAt(i)-'a')
					t+=c[j];
			ans+=t;
		}
		pw.println(ans);
		pw.flush();
		pw.close();
	}
	
	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {while (st == null || !st.hasMoreElements()) {
			try {st = new StringTokenizer(br.readLine());}
			catch (IOException e) {e.printStackTrace();}}
		return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine(){String str = "";
		try {str = br.readLine();}
		catch (IOException e) {e.printStackTrace();}
		return str;}
	}
}