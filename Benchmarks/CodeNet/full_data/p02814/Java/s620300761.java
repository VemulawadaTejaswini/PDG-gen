import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		InputReader in = new InputReader(inputStream);
		
//		for(int i=4;i<=4;i++) {
//			InputStream uinputStream = new FileInputStream("milkvisits.in");
//			String f = i+".in";
//			InputStream uinputStream = new FileInputStream(f);
//			InputReader in = new InputReader(uinputStream);
//			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milkvisits.out")));
//		}
		Task t = new Task();
		t.solve(in, out);
		out.close();
	}	
	
	static class Task{
		public void solve(InputReader in, PrintWriter out) throws IOException {
			//int a = 100000;
			//int b = 100000;
			//long c = 1l;
			//Dumper.print(a*(b-c));
			//Dumper.print(Integer.MAX_VALUE);
//			int n = in.nextInt();
//			int m = in.nextInt();
//			int arr[] = in.readIntArray(n);
//			for(int i=0;i<n;i++) arr[i]*=-1;
//			Arrays.sort(arr);
//			for(int i=0;i<n;i++) arr[i]*=-1;
//			long sum[] = new long[n];
//			for(int i=0;i<n;i++) {
//				sum[i] = arr[i];
//				if(i>0) sum[i]+=sum[i-1];
//			}
//			int l=1; int r=2*arr[0];
//			while(l<r-1) {
//				int mid = l+(r-l)/2;
//				long ret[] = cal(arr,mid);
//				if(ret[n]<m) r=mid;
//				else l=mid;
//			}
//			//Dumper.print(bfs(arr,m));
// 
//			
//			long ret[] = cal(arr,r);
//			//Dumper.print(ret[n]);
//			if(ret[n]>=m) {
//				long ret1[] = cal(arr,r+1);
//				long res = 0;
//				for(int i=0;i<n;i++) {
//					if(ret1[i]!=-1) res+=arr[i]*(ret1[i]+1)+sum[(int)ret1[i]];
//				}
//				if(m>ret1[n]) res+=r*(m-ret1[n]);
//				out.println(res);
//				return;
//			}
//			
//			ret = cal(arr,l);
//			//Dumper.print(ret[n]);
//			if(ret[n]>=m) {
//				long ret1[] = cal(arr,l+1);
//				long res = 0;
//				for(int i=0;i<n;i++) {
//					if(ret1[i]!=-1) res+=arr[i]*(ret1[i]+1)+sum[(int)ret1[i]];
//				}
//				if(m>ret1[n]) res+=l*(m-ret1[n]);
//				out.println(res);
//				return;
//			}
			int n = in.nextInt();
			long m = in.nextLong();
			long[] arr = new long[n];
			for(int i=0;i<n;i++) arr[i] = in.nextLong();
			//long gcd = arr[0];
			long lcm = arr[0];
			for(int i=1;i<n;i++) {
				//gcd = GCD(gcd,arr[i]);
				lcm = lcm*arr[i]/GCD(arr[i],lcm);
			}
			for(int i=0;i<n;i++) {
				long x = lcm/arr[i];
				if(x%2==0) {
					out.println(0);
					return;
				}
			}
			long v = m/(lcm/2);
			v-=v/2;
			out.println(v);
		}

		long[] cal(int arr[], int t) {
			long num = 0;
			int n = arr.length;
			long ret[] = new long[n+1];
			Arrays.fill(ret, -1);
			for(int i=0;i<n;i++) {
				int x = t-arr[i];
				int l = 0; int r=n-1;
				while(l<r-1) {
					int mid = l+(r-l)/2;
					if(arr[mid]<x) r=mid;
					else l=mid;
				}
				if(arr[r]>=x) {
					ret[i] = r;
					num+=r+1;
				}
				else if(arr[l]>=x) {
					ret[i] = l;
					num+=l+1;
				}
			}
			ret[n] = num;
			return ret;
		}
		
		int bfs(int[] arr, int m) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					//if(i==j) pq.add(arr[i]+arr[j]);
					//else {
						pq.add(arr[i]+arr[j]);
					//	pq.add(arr[i]+arr[j]);
					//}
				}
			}
			while(pq.size()>m) {
				int v = pq.poll();
				//if(v>115950) {
				//	Dumper.print(v);
				//}
			}
			return pq.poll();
		}

		class edge {
			int f,t,len;
			public edge(int a, int b, int c) {
				f=a;t=b;len=c;
			}
		}
	
		class pair implements Comparable<pair>{
			int idx, val;
			public pair(int a, int b) {
				idx = a;
				val = b;
			}
			@Override
			public int compareTo(pair t) {
				return this.val-t.val;
			}
		}
		  
	    class sgt{
	    	sgt lt;
	    	sgt rt;
	    	int l,r;
	    	long sum, max, min, lazy;
	    	public sgt(int L, int R, int arr[]) {
	    		l=L;r=R;
	    		if(l==r-1) {
	    			sum = max = min = arr[l];
	    			lazy = 0;
	    			return;
	    		}
	    		lt = new sgt(l, l+r>>1, arr);
	    		rt = new sgt(l+r>>1, r, arr);
	    		pop_up();
	    	}
	    	void pop_up() {
	    		this.sum = lt.sum + rt.sum;
	    		this.max = Math.max(lt.max, rt.max);
	    		this.min = Math.min(lt.min, rt.min);
	    	}
	    	void push_down() {
	    		if(this.lazy!=0) {
	    			lt.sum+=lazy;
	    			rt.sum+=lazy;
	    			lt.max+=lazy;
	    			lt.min+=lazy;
	    			rt.max+=lazy;
	    			rt.min+=lazy;
	    			lt.lazy+=this.lazy;
	    			rt.lazy+=this.lazy;
	    			this.lazy = 0;
	    		}
	    	}
	    	void change(int L, int R, int v) {
	    		if(R<=l||r<=L) return;
	    		if(L<=l&&r<=R) {
	    			this.max+=v;
	    			this.min+=v;
	    			this.sum+=v*(r-l);
	    			this.lazy+=v;
	    			return;
	    		}
	    		push_down();
	    		lt.change(L, R, v);
	    		rt.change(L, R, v);
	    		pop_up();
	    	}
	    	long query_max(int L, int R) {
	    		if(L<=l&&r<=R) return this.max;
	    		if(r<=L||R<=l) return Long.MIN_VALUE;
	    		push_down();
	    		return Math.max(lt.query_max(L, R), rt.query_max(L, R));	    		
	    	}
	    	long query_min(int L, int R) {
	    		if(L<=l&&r<=R) return this.min;
	    		if(r<=L||R<=l) return Long.MAX_VALUE;
	    		push_down();
	    		return Math.min(lt.query_min(L, R), rt.query_min(L, R));	
	    	}
	    	long query_sum(int L, int R) {
	    		if(L<=l&&r<=R) return this.sum;
	    		if(r<=L||R<=l) return 0;
	    		push_down();
	    		return lt.query_sum(L, R) + rt.query_sum(L, R);
	    	}
	    }	   
			    	
		List<List<String>> convert(String arr[][]){
			int n = arr.length;
			List<List<String>> ret = new ArrayList<>();
			for(int i=0;i<n;i++) {
				ArrayList<String> tmp = new ArrayList<String>();
				for(int j=0;j<arr[i].length;j++) tmp.add(arr[i][j]);
				ret.add(tmp);
			}
			return ret;
		}
		
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) { val = x; }
		}
	
		public int GCD(int a, int b) {
		   if (b==0) return a;
		   return GCD(b,a%b);
		}
		public long GCD(long a, long b) {
			   if (b==0) return a;
			   return GCD(b,a%b);
		}		
	}
	
	
    static class ArrayUtils {
        static final long seed = System.nanoTime();
        static final Random rand = new Random(seed);

        public static void sort(int[] a) {
            shuffle(a);
            Arrays.sort(a);
        }

        public static void shuffle(int[] a) {
            for (int i = 0; i < a.length; i++) {
                int j = rand.nextInt(i + 1);
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

    }	
	static class BIT{
		int arr[];
		int n;
		public BIT(int a) {
			n=a;
			arr = new int[n];
		}
		int sum(int p) {
			int s=0;
			while(p>0) {
				s+=arr[p];
				p-=p&(-p);
			}
			return s;
		}
		void add(int p, int v) {
			while(p<n) {
				arr[p]+=v;
				p+=p&(-p);
			}
		}
	}
	static class DSU{
		int[] arr;
		int[] sz;
		public DSU(int n) {
			arr = new int[n];
			sz = new int[n];
			for(int i=0;i<n;i++) arr[i] = i;
			Arrays.fill(sz, 1);
		}
		public int find(int a) {
			if(arr[a]!=a) arr[a] = find(arr[a]);
			return arr[a];
		}
		public void union(int a, int b) {
			int x = find(a);
			int y = find(b);
			if(x==y) return;
			arr[y] = x;
			sz[x] += sz[y];
		}
		public int size(int x) {
			return sz[find(x)];
		}
	}	
	static class MinHeap<Key> implements Iterable<Key> {
		private int maxN;
		private int n;
		private int[] pq;
		private int[] qp;
		private Key[] keys;
		private Comparator<Key> comparator;
		
		public MinHeap(int capacity){
			if (capacity < 0) throw new IllegalArgumentException();
			this.maxN = capacity;
			n=0;
			pq = new int[maxN+1];
			qp = new int[maxN+1];
			keys = (Key[]) new Object[capacity+1];
			Arrays.fill(qp, -1);
		}
		
		public MinHeap(int capacity, Comparator<Key> c){
			if (capacity < 0) throw new IllegalArgumentException();
			this.maxN = capacity;
			n=0;
			pq = new int[maxN+1];
			qp = new int[maxN+1];
			keys = (Key[]) new Object[capacity+1];
			Arrays.fill(qp, -1);
			comparator = c;
		}			
		public boolean isEmpty()	{ return n==0; 	}
		public int size()			{ return n;		}
		public boolean contains(int i) {
	        if (i < 0 || i >= maxN) throw new IllegalArgumentException();
	        return qp[i] != -1;
		}	
		public int peekIdx() {
	        if (n == 0) throw new NoSuchElementException("Priority queue underflow");
	        return pq[1];		
		}	
		public Key peek(){
			if(isEmpty()) throw new NoSuchElementException("Priority queue underflow");
			return keys[pq[1]];
		}
		public int poll(){
			if(isEmpty()) throw new NoSuchElementException("Priority queue underflow");
			int min = pq[1];
			exch(1,n--);
			down(1);
			assert min==pq[n+1];
			qp[min] = -1;
			keys[min] = null;		
			pq[n+1] = -1;
			return min;
		}
	    public void update(int i, Key key) {
	        if (i < 0 || i >= maxN) throw new IllegalArgumentException();
	        if (!contains(i)) {
	        	this.add(i, key);
	        }else {
	        	keys[i] = key;
	        	up(qp[i]);
	        	down(qp[i]);
	        }
	    }	
		private void add(int i, Key x){
	        if (i < 0 || i >= maxN) throw new IllegalArgumentException();
	        if (contains(i)) throw new IllegalArgumentException("index is already in the priority queue");
	        n++;
	        qp[i] = n;
	        pq[n] = i;
	        keys[i] = x;
	        up(n);
		}
		private void up(int k){
			while(k>1&&less(k,k/2)){
				exch(k,k/2);
				k/=2;
			}
		}
		private void down(int k){
			while(2*k<=n){
				int j=2*k;
				if(j<n&&less(j+1,j)) j++;
				if(less(k,j)) break;
				exch(k,j);
				k=j;
			}
		}
		
		public boolean less(int i, int j){
	        if (comparator == null) {
	            return ((Comparable<Key>) keys[pq[i]]).compareTo(keys[pq[j]]) < 0;
	        }
	        else {
	            return comparator.compare(keys[pq[i]], keys[pq[j]]) < 0;
	        }
		}

		public void exch(int i, int j){
	        int swap = pq[i];
	        pq[i] = pq[j];
	        pq[j] = swap;
	        qp[pq[i]] = i;
	        qp[pq[j]] = j;
		}

		@Override
		public Iterator<Key> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
	}  	

    private static class InputReader
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int zcurChar;
        private int znumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (znumChars == -1)
                throw new InputMismatchException();
            if (zcurChar >= znumChars)
            {
            	zcurChar = 0;
                try
                {
                    znumChars = stream.read(buf);
                } catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                if (znumChars <= 0)
                    return -1;
            }
            return buf[zcurChar++];
        }

        public int nextInt()
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
            int res = 0;
            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String nextString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return nextString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
        public int[] readIntArray(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }        
    }    

	static class Dumper {
		static void print_int_arr(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
		}

		static void print_char_arr(char[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
		}

		static void print_double_arr(double[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
		}

		static void print_2d_arr(int[][] arr, int x, int y) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("---------------------");
		}

		static void print_2d_arr(boolean[][] arr, int x, int y) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("---------------------");
		}

		static void print(Object o) {
			System.out.println(o.toString());
		}

		static void getc() {
			System.out.println("here");
		}
	}
}