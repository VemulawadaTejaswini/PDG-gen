import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

 class Main{

	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		Set<Character> set = new HashSet<>();
		int n=sc.nextInt();
		/*int m=0,a=0,r=0,c=0,h=0,ex=0;
		for(int i=0;i<n;i++){
			String ss=sc.nextLine();
			Character chr = ss.charAt(0);
			if(chr=='M'||chr=='A'||chr=='R'||chr=='C'||chr=='H')set.add(chr);
			if(ss.charAt(0)=='M')m++;
			else if(ss.charAt(0)=='A')a++;
			else if(ss.charAt(0)=='R')r++;
			else if(ss.charAt(0)=='C')c++;
			else if(ss.charAt(i)=='H')h++;
			else ex++;
		}
		long ans=0;
		if(set.size()<=2)
			System.out.println(0);
		else{
			long size=set.size();
			ans=(s)
		}*/
		
		String[] ss =sc.nextLine().split(" ");
		for(int i=0;i<n;i++)
			set.add(ss[i].charAt(0));
		System.out.println(set.size()==3?"Three":"Four");
//		codeChefQ2(sc);
//		codeChefQ3(sc);
}

}