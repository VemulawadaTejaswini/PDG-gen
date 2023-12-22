import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.IdentityHashMap;
			
			
/**
 * for competitive programming
 * @author BrolyCode
 * @version 1.0.0
 */
			
			public class Main {
				static Random random;
				private static void mySort(int[] s) {
			        for (int i = 0; i < s.length; ++i) {
			            int j = random.nextInt(i + 1);
			            int t = s[i];
			            s[i] = s[j];
			            s[j] = t;
			        }
			        Arrays.sort(s);
			    }
				
				static class Pair{
					int x;
					int y;
					
					public Pair(int x, int y) {
						this.x=x;
						this.y=y;
					}
				}
				
				public static void sortPairX(Pair[] p) {
					Arrays.sort(p, new Comparator<Pair>() {
						public int compare(Pair o1, Pair o2) {
							return o1.x-o2.x;
						}			
					});
				}
				
				public static void sortPairY(Pair[] p) {
					Arrays.sort(p, new Comparator<Pair>() {
						public int compare(Pair o1, Pair o2) {
							return o1.y-o2.y;
						}			
					});
				}
				
				
			
				public static void main(String[] args) {
					random = new Random(543534151132L + System.currentTimeMillis());
					InputStream inputStream = System.in;
			        OutputStream outputStream = System.out;
			        InputReader in = new InputReader(inputStream);
			        PrintWriter out = new PrintWriter(outputStream);
			        
			        task(in,out);
			        
					out.close();
					
				}
				
			
				private static void task(InputReader in, PrintWriter out) {
					
					int n=in.nextInt();
					int q=in.nextInt();
					TreeMap<Integer,Integer> values=new TreeMap<Integer,Integer>();
					HashMap<Integer,ArrayList<Integer>> tree=new HashMap<Integer,ArrayList<Integer>>();
					for(int i=0;i<n-1;i++) {
						int a=in.nextInt();
						int b=in.nextInt();
						values.put(a, 0);
						values.put(b,0);
						if(!tree.containsKey(a))tree.put(a, new ArrayList<Integer>());
						if(!tree.containsKey(b))tree.put(b, new ArrayList<Integer>());
						tree.get(a).add(b);
					}
					for(int i=0;i<q;i++) {
						int a=in.nextInt();
						int x=in.nextInt();
						bfs(tree,a,x,values);
					}
					
					for(int i:values.keySet()) {
						out.print(values.get(i)+" ");
					}
				}	
				

				private static void bfs(HashMap<Integer, ArrayList<Integer>> tree, int q, int x, TreeMap<Integer,Integer> values) {
					values.put(q, values.get(q)+x);
					for(int i:tree.get(q)) {
						bfs(tree,i,x,values);
					}
				}

				public static int gcd(int a, int b)  
			    { 
			        BigInteger b1 = BigInteger.valueOf(a); 
			        BigInteger b2 = BigInteger.valueOf(b); 
			        BigInteger gcd = b1.gcd(b2); 
			            return gcd.intValue(); 
			    } 
			      
			    public static long gcd(long a, long b)  
			    { 
			        BigInteger b1 = BigInteger.valueOf(a); 
			        BigInteger b2 = BigInteger.valueOf(b); 
			        BigInteger gcd = b1.gcd(b2); 
			            return gcd.longValue(); 
			    } 
				
				static class InputReader {
			        public BufferedReader reader;
			        public StringTokenizer tokenizer;
			
			        public InputReader(InputStream stream) {
			            reader = new BufferedReader(new InputStreamReader(stream), 32768);
			            tokenizer = null;
			        }
			
			        public String next() {
			            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			                try {
			                    tokenizer = new StringTokenizer(reader.readLine());
			                } catch (IOException e) {
			                    throw new RuntimeException(e);
			                }
			            }
			            return tokenizer.nextToken();
			        }
			
			        public int nextInt() {
			            return Integer.parseInt(next());
			        }
			        
			        public long nextLong() {
			            return Long.parseLong(next());
			        }
			        
			        public double nextDouble() {
			            return Double.parseDouble(next());
			        }
			        
			        public float nextFloat() {
			            return Float.parseFloat(next());
			        }
			        
			    }
			
			}
			
		  
		  