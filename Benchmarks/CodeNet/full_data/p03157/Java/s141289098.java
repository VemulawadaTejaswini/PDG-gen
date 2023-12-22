							import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.InputMismatchException;
	import java.util.TreeSet;
								public class Main implements Runnable
								{
									static final long MOD = 1000000007L;
									static final long MOD2 = 1000000009L;
									static class InputReader
									{
										private InputStream stream;
										private byte[] buf = new byte[1024];
										private int curChar;
										private int numChars;
										private SpaceCharFilter filter;
										private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
								 
										public InputReader(InputStream stream)
										{
											this.stream = stream;
										}
										
										public int read()
										{
											if (numChars==-1) 
												throw new InputMismatchException();
											
											if (curChar >= numChars)
											{
												curChar = 0;
												try 
												{
													numChars = stream.read(buf);
												}
												catch (IOException e)
												{
													throw new InputMismatchException();
												}
												
												if(numChars <= 0)				
													return -1;
											}
											return buf[curChar++];
										}
									 
										public String nextLine()
										{
											String str = "";
								            try
								            {
								                str = br.readLine();
								            }
								            catch (IOException e)
								            {
								                e.printStackTrace();
								            }
								            return str;
										}
										public int nextInt()
										{
											int c = read();
											
											while(isSpaceChar(c)) 
												c = read();
											
											int sgn = 1;
											
											if (c == '-') 
											{
												sgn = -1;
												c = read();
											}
											
											int res = 0;
											do 
											{
												if(c<'0'||c>'9') 
													throw new InputMismatchException();
												res *= 10;
												res += c - '0';
												c = read();
											}
											while (!isSpaceChar(c)); 
											
											return res * sgn;
										}
										
										public long nextLong() 
										{
											int c = read();
											while (isSpaceChar(c))
												c = read();
											int sgn = 1;
											if (c == '-') 
											{
												sgn = -1;
												c = read();
											}
											long res = 0;
											
											do 
											{
												if (c < '0' || c > '9')
													throw new InputMismatchException();
												res *= 10;
												res += c - '0';
												c = read();
											}
											while (!isSpaceChar(c));
												return res * sgn;
										}
										
										public double nextDouble() 
										{
											int c = read();
											while (isSpaceChar(c))
												c = read();
											int sgn = 1;
											if (c == '-') 
											{
												sgn = -1;
												c = read();
											}
											double res = 0;
											while (!isSpaceChar(c) && c != '.') 
											{
												if (c == 'e' || c == 'E')
													return res * Math.pow(10, nextInt());
												if (c < '0' || c > '9')
													throw new InputMismatchException();
												res *= 10;
												res += c - '0';
												c = read();
											}
											if (c == '.') 
											{
												c = read();
												double m = 1;
												while (!isSpaceChar(c)) 
												{
													if (c == 'e' || c == 'E')
														return res * Math.pow(10, nextInt());
													if (c < '0' || c > '9')
														throw new InputMismatchException();
													m /= 10;
													res += (c - '0') * m;
													c = read();
												}
											}
											return res * sgn;
										}
										
										public String readString() 
										{
											int c = read();
											while (isSpaceChar(c))
												c = read();
											StringBuilder res = new StringBuilder();
											do 
											{
												res.appendCodePoint(c);
												c = read();
											} 
											while (!isSpaceChar(c));
											
											return res.toString();
										}
									 
										public boolean isSpaceChar(int c) 
										{
											if (filter != null)
												return filter.isSpaceChar(c);
											return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
										}
									 
										public String next() 
										{
											return readString();
										}
										
										public interface SpaceCharFilter 
										{
											public boolean isSpaceChar(int ch);
										}
									}
								 	
									public static void main(String args[]) throws Exception
									{
										new Thread(null, new Main(),"Main",1<<26).start();
									}
									int MAXN = 1000001;
									ArrayList<Integer> adj[];
		
									
									int[] dx = {1,-1,0,0};
									int[] dy = {0,0,1,-1};
									Pair[] p;
									public void run() 
									{
										PrintWriter w= new PrintWriter(System.out);
							            InputReader sc = new InputReader(System.in);
							            int n = sc.nextInt();
							            int m = sc.nextInt();
							            char[][] ch = new char[n+1][m+1];
							            for(int i = 1;i <= n;i++) {
							            	char[] temp = sc.next().toCharArray();
							            	for(int j = 1;j <= m;j++) {
							            		ch[i][j] = temp[j-1];
							            	}
							            }
							            TreeSet<Integer>[][][] dp = new TreeSet[n+1][m+1][2];
							            dp[1][1][0] = new TreeSet();
							            dp[1][1][1] = new TreeSet();
							            for(int i = 1;i <= n;i++) {
							            	for(int j = 1;j <= m;j++) {
							            		if(i ==1 && j == 1) {
							            			continue;
							            		}else {
							            			dp[i][j][0] = new TreeSet();
							            			dp[i][j][1] = new TreeSet();
							            			if(ch[i-1][j] != ch[i][j] && (ch[i-1][j] == '.' || ch[i-1][j] == '#')) {
							            				if(ch[i-1][j] =='.') {
							            					dp[i][j][0].addAll((TreeSet)dp[i-1][j][0].clone());
							            					dp[i][j][0].add((i-1)*m + j);
							            					dp[i][j][1].addAll((TreeSet)dp[i-1][j][1].clone());
							            				}else {
							            					dp[i][j][1].addAll((TreeSet)dp[i-1][j][1].clone());
							            					dp[i][j][1].add((i-1)*m + j);
							            					dp[i][j][0].addAll((TreeSet)dp[i-1][j][0].clone());
							            				
							            				}
							            			}
							            			if(ch[i][j-1] != ch[i][j] && (ch[i][j-1] == '.' || ch[i][j-1] == '#')) {
							            				if(ch[i][j-1] =='.') {
							            					dp[i][j][0].addAll((TreeSet)dp[i][j-1][0].clone());
							            					dp[i][j][0].add((i*m + j-1));
							            					dp[i][j][1].addAll((TreeSet)dp[i][j-1][1].clone());
							            				}else {
							            					dp[i][j][1].addAll((TreeSet)dp[i][j-1][1].clone());
							            					dp[i][j][1].add((i*m + j-1));
							            					dp[i][j][0].addAll((TreeSet)dp[i][j-1][0].clone());
							            				
							            				}
							            			}
							            		}
							            	}
							            }
							            long ans = 0;
							            /*for(int i = 1;i <= n;i++) {
							            	for(int j = 1;j <= m;j++) {
							            		w.print(dp[i][j][0].size() + " ");
							            	}
							            	w.println();
							            }
							            for(int i = 1;i <= n;i++) {
							            	for(int j = 1;j <= m;j++) {
							            		w.print(dp[i][j][1].size() + " ");
							            	}
							            	w.println();
							            }*/
							            for(int i = 1;i <= n;i++) {
							            	for(int j = 1;j <= m;j++) {
							            		
							            		if(ch[i][j] == '.') {
							            			ans += dp[i][j][1].size();
							            			
							            			//w.print(dp[i][j][1] + " ");
							            		}else {
							            			ans += dp[i][j][0].size();
							            			//w.print(dp[i][j][0] + " ");
							            		}
							            	}
							            	//w.println();
							            }
							            w.println(ans);
										w.close();
									}
									
									static long gcd(long a,long b) {
										
										      if (b == 0) 
										        return a; 
										      return gcd(b, a % b);  
										    
									}
									static class Pair implements Comparable<Pair>{
										int a;
										int b;
										
										Pair(int a, int b){
											this.a = a;
											this.b = b;
											
										}
										@Override
										public int compareTo(Pair o) {
											// TODO Auto-generated method stub
											if(this.a == o.a) {
												return Long.compare(o.b,this.b);
											}
											return Long.compare(o.a,this.a);
										}
										public boolean equals(Object o) {
											Pair p = (Pair)o;
											return this.a == p.a && this.b == p.b;
										}
										public int hashCode(){
											return Long.hashCode(a)*27 + Long.hashCode(b)* 31;
										}
									}
									
								}