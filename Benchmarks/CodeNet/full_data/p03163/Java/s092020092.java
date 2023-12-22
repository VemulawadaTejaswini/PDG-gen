
                    import java.io.BufferedReader;
                    import java.io.FileReader;
                    import java.io.IOException;
                    import java.io.InputStream;
                    import java.io.InputStreamReader;
                    import java.io.PrintWriter;
                    import java.math.BigInteger;
                    import java.util.*;
                        public class Hello {

                      static long A = 1000000000+7;
     
                    	    
                    	    static long[][] binomialCoeff(int n, int k) 
                    	    { 
                    	    long C[][] = new long[n+1][k+1]; 
                    	    int i, j; 
                    	      
                    	        // Calculate  value of Binomial Coefficient in bottom up manner 
                    	    for (i = 0; i <= n; i++) 
                    	    { 
                    	        for (j = 0; j <= Math.min(i, k); j++) 
                    	        { 
                    	            // Base Cases 
                    	            if (j == 0 || j == i) 
                    	                C[i][j] = 1; 
                    	       
                    	            // Calculate value using previously stored values 
                    	            else
                    	                C[i][j] = (C[i-1][j-1]%A + C[i-1][j]%A)%A; 
                    	          } 
                    	     } 
                    	       
                    	    return C; 
                    	    }
                    	    //static long[][] C = binomialCoeff(4000, 50);
                    	    static long[][] dp;
                    	    public static long f(int[] arr,int[] w,int n,int sum,int W) {
                    	    	if(n==arr.length)return 0;
                    	    	if(dp[n][sum]!=-1)return dp[n][sum];
                    	    	if(w[n]+sum<=W) {
                    	    		return dp[n][sum] = Math.max(1l*arr[n]+f(arr,w,n+1,sum+w[n],W), f(arr,w,n+1,sum,W));
                    	    	}
                    	    	return dp[n][sum] = f(arr,w,n+1,sum,W);
                    	    }
                    	public static void main(String[] args) throws IOException {
                    		
                    		Scanner sc = new Scanner(System.in);
                    		PrintWriter pw = new PrintWriter(System.out);
                    		int n = sc.nextInt();int W= sc.nextInt();
                    		int[] arr = new int[n];int[] w = new int[n];
                    		for(int i=0;i<n;i++) {
                    			w[i] = sc.nextInt();arr[i] = sc.nextInt();
                    		}
                    		dp = new long[105][100000+5];
                    		for(int i=0;i<dp.length;i++)
                    			for(int j=0;j<dp[i].length;j++)
                    				dp[i][j]=-1;
                    		pw.println(f(arr,w,0,0,W));
                    		pw.flush();
                    		pw.close();
                    	}
                    }
                        class Scanner {
                            StringTokenizer st;
                            BufferedReader br;
                         
                            public Scanner(FileReader r) {
                                br = new BufferedReader(r);
                            }
                         
                            public Scanner(InputStream s) {
                                br = new BufferedReader(new InputStreamReader(s));
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
                         
                            public double nextDouble() throws IOException {
                                String x = next();
                                StringBuilder sb = new StringBuilder("0");
                                double res = 0, f = 1;
                                boolean dec = false, neg = false;
                                int start = 0;
                                if (x.charAt(0) == '-') {
                                    neg = true;
                                    start++;
                                }
                                for (int i = start; i < x.length(); i++)
                                    if (x.charAt(i) == '.') {
                                        res = Long.parseLong(sb.toString());
                                        sb = new StringBuilder("0");
                                        dec = true;
                                    } else {
                                        sb.append(x.charAt(i));
                                        if (dec)
                                            f *= 10;
                                    }
                                res += Long.parseLong(sb.toString()) / f;
                                return res * (neg ? -1 : 1);
                            }
                         
                            public boolean ready() throws IOException {
                                return br.ready();
                                
                            }
                        }