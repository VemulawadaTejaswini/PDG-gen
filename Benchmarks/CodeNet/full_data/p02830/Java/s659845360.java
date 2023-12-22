import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
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
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		int n = ob.nextInt();
		String s = ob.next(),t=ob.next(),ans="";
		int i=0,j=0;
		boolean flag=true;
		while(i<n || j<n) {
			if(flag) {
				ans+=s.charAt(i);
				i++;
				flag=false;
			}
			else {
				ans+=t.charAt(j);
				j++;
				flag=true;
			}
		}
		System.out.println(ans);
		
	}

}
