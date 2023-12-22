import java.util.*;
import java.util.Map.Entry;
import java.io.*;
        public class Main {
        	public static void main(String[] args) throws IOException, InterruptedException {
        		Scanner sc =new Scanner(System.in);
        		PrintWriter pw =new PrintWriter(System.out);
        		char[] x =("0"+sc.next()).toCharArray(),y=("0"+sc.next()).toCharArray();
        		int [][] dp =new int [x.length][y.length];
        		for (int i =1;i<x.length;++i) {
        			for (int j =1;j<y.length;++j) {
        				if (x[i]==y[j])
        					dp[i][j]=dp[i-1][j-1]+1;
        				else
        					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
        			}
        		}
        		Stack<Character>st =new Stack<Character>();
        		int i=x.length-1,j=y.length-1;
        		while (true) {
        			if (j<=0||i<=0)
        				break;
        			if (dp[i][j]!=dp[i-1][j]&&dp[i][j]!=dp[i][j-1])
        			{
        				st.push(x[i]);
        				i--;
        				j--;
        			}
        			else if (dp[i][j]==dp[i-1][j])
        				--i;
        			else
        				j--;
        		}
        		while (!st.isEmpty())
        			pw.print(st.pop());
        		pw.close();
        	}
            static int mod(int x,int y)
            {
                if(x<0)
                    x=x+(-x/y+1)*y;
                return x%y;
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
        }