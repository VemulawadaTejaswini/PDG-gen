import java.util.*;
import java.util.Map.Entry;
import java.io.*;
        public class Main {
        	static long dp[][];
        	static long w;
        	static int n;
        	static long [] weight ,value;
        	public static void main(String[] args) throws IOException {
        		Scanner sc =new Scanner(System.in);
        		PrintWriter pw =new PrintWriter(System.out);
        		 n=sc.nextInt();
        		 w=sc.nextInt();
        		dp=new long [n][(int)w];
        		weight =new long[n];
        		value=new long[n];
        		for (int i=0;i<n;++i) {
        			weight[i]=sc.nextLong();
        			value[i]=sc.nextLong();
        		}
        		for (int i =0;i<n;++i)
        			Arrays.fill(dp[i],-1);
        		//System.out.println(w);
        		dp(0,w);     		
        		pw.print(dp[0][(int)w-1]);
          		pw.close();
        	}
        	public static long dp(int index , long e) {
        		//System.out.println(index+" "+e);
        		if (e<0)
        			return -1*Long.MAX_VALUE;
        		if (e==0||index>=n)
        			return 0l;
        		if (dp[index][(int)e-1]!=-1)
        			return dp[index][(int)e-1];
        		if (e-weight[index]<0)
        			return dp(index+1,e); 
        		return dp[index][(int)e-1]=Math.max(dp(index+1,e),dp(index+1, e-weight[index])+value[index]);
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
			static class SegmentTree {
			    public static class STNode {
			        int leftIndex;
			        int rightIndex;
			        int sum;
			        STNode leftNode;
			        STNode rightNode;
			    }

			    static STNode constructSegmentTree(int[] A, int l, int r) {
			        if (l == r) {
			            STNode node = new STNode();
			            node.leftIndex = l;
			            node.rightIndex = r;
			            node.sum = A[l];
			            return node;
			        }
			        int mid = (l + r) / 2;
			        STNode leftNode = constructSegmentTree(A, l, mid);
			        STNode rightNode = constructSegmentTree(A, mid+1, r);
			        STNode root = new STNode();
			        root.leftIndex = leftNode.leftIndex;
			        root.rightIndex = rightNode.rightIndex;
			        root.sum = leftNode.sum + rightNode.sum;
			        root.leftNode = leftNode;
			        root.rightNode = rightNode;
			        return root;
			    }

			    static int getSum(STNode root, int l, int r) {
			        if (root.leftIndex >= l && root.rightIndex <= r) {
			            return root.sum;
			        }
			        if (root.rightIndex < l || root.leftIndex > r) {
			            return 0;
			        }
			        return getSum(root.leftNode, l, r) + getSum(root.rightNode, l, r);
			    }

			    /**
			     * 
			     * @param root
			     * @param index index of number to be updated in original array 
			     * @param newValue
			     * @return difference between new and old values
			     */
			    static int updateValueAtIndex(STNode root, int index, int newValue) {
			        int diff = 0;
			        if(root.leftIndex==root.rightIndex && index == root.leftIndex) {
			            // We actually reached to the leaf node to be updated
			            diff = newValue-root.sum;
			            root.sum=newValue;
			            return diff;
			        }
			        int mid = (root.leftIndex + root.rightIndex) / 2;
			        if (index <= mid) {
			            diff= updateValueAtIndex(root.leftNode, index, newValue);
			        } else {
			            diff= updateValueAtIndex(root.rightNode, index, newValue);
			        }
			        root.sum+=diff;
			        return diff;
			    }
			}
        }