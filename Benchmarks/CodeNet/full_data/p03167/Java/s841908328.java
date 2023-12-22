import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException,InterruptedException{
	Scanner sc =new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);
	int n =sc.nextInt(),m=sc.nextInt();
	char [][] arr=new char[n][m];
	for (int i=0;i<n;++i)
		arr[i]=sc.next().toCharArray();
	long mod =(int)1e9+7;
	long [] [] poss=new long [n][m];
	poss[0][0]=1;
	for (int i =0;i<n;++i)
		for (int j=0;j<m;++j) {
			if (arr[i][j]=='#')
				continue;
			poss[i][j]+=((i-1>=0&&arr[i-1][j]=='.')?poss[i-1][j]:0)%mod;
			poss[i][j]+=((j-1>=0&&arr[i][j-1]=='.')?poss[i][j-1]:0)%mod;
		}
	//System.out.println(Arrays.deepToString(poss));
	pw.println(poss[n-1][m-1]%mod);
	pw.flush();
  }
  static long gcd (long a ,long b)
  {
	  return (b==0)?a:gcd(b, a%b);
  }
  static long [] gcd2 (long a ,long b) {
	  if (b==0)
		  return new long [] {a,1,0};
	  long [] val =gcd2(b, a%b);
	  long gcd =val[0];
	  long x =val[2],y=val[1]-(a/b)*val[2];
	  return new long [] {gcd,x,y};
  }
  static class Scanner {
		StringTokenizer stringTokenizer;	
		BufferedReader bfBufferedReader;
		public Scanner(InputStream system) {
			bfBufferedReader=new BufferedReader(new InputStreamReader( system));
		}
		 public Scanner(String file) throws Exception {
	            bfBufferedReader = new BufferedReader(new FileReader( file));
	        }			 
	        public String next() throws IOException {
	            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens())
	                stringTokenizer = new StringTokenizer( bfBufferedReader.readLine());
	            return stringTokenizer.nextToken();
	        }
	 
	        public String nextLine() throws IOException {
	            return bfBufferedReader.readLine();
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
	 
	        public Long nextLong() throws IOException {
	            return Long.parseLong(next());
	        }
	 
	        public boolean ready() throws IOException {
	            return bfBufferedReader.ready();
	        }
	 
	        public void waitForInput() throws InterruptedException {
	            Thread.sleep(3000);
	        }
  }
  }