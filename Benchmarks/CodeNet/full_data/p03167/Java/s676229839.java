import java.util.*;
import java.util.Map.Entry;
import java.io.*;
        public class Main {
        	static int n ,m;
        	static char[][]arr;
        	static long [][] memo;
        	public static void main(String[] args) throws IOException {
        		Scanner sc =new Scanner(System.in);
        		PrintWriter pw =new PrintWriter(System.out);
        		n=sc.nextInt();m=sc.nextInt();
        		arr=new char[n][];
        		memo =new long[n][m];
        		long mod =1000000000+7;
        		for (int i=0;i<n;++i) {
        			arr[i]=sc.next().toCharArray();
        		}
        		memo[n-1][m-1]=1;
        		for (int i =n-1;i>=0;--i) {
        			for (int j =m-1;j>=0;--j) {
        				if (i+1<n&&arr[i+1][j]!='#')
        					memo[i][j]+=memo[i+1][j]%mod;
        				if (j+1<m&&arr[i][j+1]!='#')
        					memo[i][j]+=memo[i][j+1]%mod;
//        				print(memo);
//        			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%% "+i+" "+j);
        			}

        		}
        		pw.print(memo[0][0]%mod);
          		pw.close();
        	}
    		static long gcd(long a, long b) 
    		{ 
    		    if (a == 0) 
    		        return b; 
    		    return gcd(b % a, a); 
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
			public static void print(long [][]d) {
				for (int i=0;i<d.length;++i)
					System.out.println(Arrays.toString(d[i]));
			}
        }