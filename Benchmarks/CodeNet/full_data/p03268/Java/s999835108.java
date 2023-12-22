import java.util.*;
import java.io.*;

public class Main{

	
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter  out=new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		long tmp=n/k;
		
		long ans=tmp*tmp*tmp;
		
		
		long m=0;
		if(k%2==0)
		{
			
			int mod=k/2;
			while(mod<=n) {
				m++;
				mod+=k;
			}
			
			
		}
		ans+=m*m*m;
		//ans+=m*1L*(m-1)*3;
		out.println(ans);
		out.close();
	}
	
	static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }
 
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public String nextLine() throws IOException {
            return br.readLine();
        }
        public boolean ready() throws IOException {return br.ready();}
        public double nextDouble() throws IOException {return Double.parseDouble(next());}
       
    }

}