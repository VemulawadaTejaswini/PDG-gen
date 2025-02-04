	import java.io.*;
	import java.util.*;

	public class Main {
		static final StdIn in = new StdIn();
		static final PrintWriter out = new PrintWriter(System.out);

		public static void main(String[] args) {
			// int t = in.nextInt();
			// int k = in.nextInt();
			
			String str = in.nextLine();
			char[] arr =str.toCharArray();

			StringBuilder s1 = new StringBuilder();
			s1.append(arr[0]);
			s1.append(arr[1]);

			StringBuilder s2 = new StringBuilder();
			s2.append(arr[2]);
			s2.append(arr[3]);

			int a1 = Integer.parseInt(s1.toString());
			int a2 = Integer.parseInt(s2.toString());

			//YYMM
			if(1 <= a1 && a1 >= 12) {
				if(1 <= a2 && a2 >= 12) {
					out.println("AMBIGUOUS");
				} else {
					out.println("MMYY");
				}
			} else {
				if(1 <= a2 && a2 <= 12) {
					out.println("YYMM");
				} else {
					out.println("NA");
				}
			}

			// if(a1 == 0 || a2 == 0) {
			// 	out.println("NA");
			// } else if(a1 <= 12 && a2 <= 12) {
			// 	out.println("AMBIGUOUS");
			// } else if(a1 <=12 && a2 > 12) {
			// 	out.println("MMYY");
			// } else if(a1 > 12 && a2 <= 12) {
			// 	out.println("YYMM");
			// } else {
			// 	out.println("NA");
			// }

			//MMYY


			
			out.println();
			out.close();

		}


		public static boolean isEven(int num) {
			if(num%2 == 0) {
				return true;
			} else {
				return false;
			}
		}


		static class Rating {
			int before;
			int after;
		}
		
		static class Pair1 {
			long first;
			long second;
		}

		static void swap(int a, int b) {
			int temp = a;
			a = b;
			b = temp;
		}

		public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) 
		{ 
			// Arraylist for storing reversed elements 
			// this.revArrayList = alist; 
			for (int i = 0; i < alist.size() / 2; i++) { 
				Integer temp = alist.get(i); 
				alist.set(i, alist.get(alist.size() - i - 1)); 
				alist.set(alist.size() - i - 1, temp); 
			} 
	
			// Return the reversed arraylist 
			return alist; 
		} 

		static class Pair {
			int first = 1;
			int second = 2;
		}

		public void fibonacci(int N) {
			boolean arr[] = new boolean[N];
			Arrays.fill(arr, false);
			arr[0] = true;
			if(N>1)
				arr[1] = true;

			Pair p = new Pair();
			for (int i = 3; i <= N; i++) {
				
				if(p.first + p.second == i) {
					arr[i-1] = true;
					p.first = p.second;
					p.second = i;
				} else {
					arr[i-1] = false;
				}
			}
		}

		public class Solver {
			Solver() {
				
			}
			
		}

		static long factorial(long x) {
			if(x <= 1) {
				return 1;
			}
			long res = 2;
			for (int i = 3; i <= x; i++) {
				res = res * i;
			}
			return res;
		}
		
		static long gcdOfFactorial(long a, long b) { 
			if (b == 0) 
				return a; 
			return gcdOfFactorial(b, a % b);
		} 
		
		static class StdIn {
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			public StdIn() {
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
			public StdIn(InputStream in) {
				try{
					din = new DataInputStream(in);
				} catch(Exception e) {
					throw new RuntimeException();
				}
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
			public String next() {
				int c;
				while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
				StringBuilder s = new StringBuilder();
				while (c != -1)
				{
					if (c == ' ' || c == '\n'||c=='\r')
						break;
					s.append((char)c);
					c=read();
				}
				return s.toString();
			}
			public String nextLine() {
				int c;
				while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
				StringBuilder s = new StringBuilder();
				while (c != -1)
				{
					if (c == '\n'||c=='\r')
						break;
					s.append((char)c);
					c = read();
				}
				return s.toString();
			}
			public int nextInt() {
				int ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do
					ret = ret * 10 + c - '0';
				while ((c = read()) >= '0' && c <= '9');

				if (neg)
					return -ret;
				return ret;
			}
			public int[] readIntArray(int n, int os) {
				int[] ar = new int[n];
				for(int i=0; i<n; ++i)
					ar[i]=nextInt()+os;
				return ar;
			}
			public long nextLong() {
				long ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do
					ret = ret * 10 + c - '0';
				while ((c = read()) >= '0' && c <= '9');
				if (neg)
					return -ret;
				return ret;
			}
			public long[] readLongArray(int n, long os) {
				long[] ar = new long[n];
				for(int i=0; i<n; ++i)
					ar[i]=nextLong()+os;
				return ar;
			}
			public double nextDouble() {
				double ret = 0, div = 1;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do
					ret = ret * 10 + c - '0';
				while ((c = read()) >= '0' && c <= '9');
				if (c == '.')
					while ((c = read()) >= '0' && c <= '9')
						ret += (c - '0') / (div *= 10);
				if (neg)
					return -ret;
				return ret;
			}
			private void fillBuffer() throws IOException {
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
				if (bytesRead == -1)
					buffer[0] = -1;
			}
			private byte read() {
				try{
					if (bufferPointer == bytesRead)
						fillBuffer();
					return buffer[bufferPointer++];
				} catch(IOException e) {
					throw new RuntimeException();
				}
			}
			public void close() throws IOException {
				if (din == null)
					return;
				din.close();
			}
		}
	}