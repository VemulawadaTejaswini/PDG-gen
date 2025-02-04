import java.io.*;
import java.util.Random;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		InputReader in = new InputReader(inputStream);
		
//		for(int i=4;i<=4;i++) {
//			InputStream uinputStream = new FileInputStream("cowmbat.in");
//			String f = i+".in";
//			InputStream uinputStream = new FileInputStream(f);
//			InputReader in = new InputReader(uinputStream);
//			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowmbat.out")));
			Task t = new Task();
			t.solve(in, out);
			out.close();			
//		}
	}	
	
	static class Task {
 
		public void solve(InputReader in, PrintWriter out) throws IOException {
//			int n = in.nextInt();	
//			int arr[] = new int[n+1];
//			int idx[] = new int[n+1];
//			for(int i=1;i<=n;i++) {
//				int v = in.nextInt();
//				arr[i] = v;
//				idx[v] = i;
//			}
//			BIT bit_num = new BIT(n+1);
//			BIT bit_idx = new BIT(n+1);
//			int rev = 0;
//			for(int i=1;i<=n;i++) {
//				if(i==1) {
//					out.print(0);
//					bit_num.add(i, idx[i]);
//					bit_idx.add(idx[i], 1);						
//				}else {
//					rev+=i-1-bit_idx.sum(idx[i]);
//					bit_num.add(i, idx[i]);
//					bit_idx.add(idx[i], 1);	
//					int l = 1; int r = n;
//					while(l<r-1) {
//						int mid = l+(r-l)/2;
//						int x = bit_idx.sum(mid);
//						if(x<=(i+1)/2) r = mid;
//						else l = mid;
//					}
//					int p = l;
//					if(bit_idx.sum(r)<=(i+1)/2) p = r;
//					Dumper.print(i+" "+p);
//					int left_sum = bit_num.sum(p);
//					int rigth_sum = bit_num.sum(i)-left_sum;
//					int cnt = i/2;
//					int t = rev;
//					t+= p*(i+1)/2-left_sum-cnt*(cnt-1)/2;
//					t+= rigth_sum-cnt*(p+1)-cnt*(cnt-1)/2;
//					out.print(" "+t);
//				}
//			}
			
//			int n = in.nextInt();
//			ArrayList<Integer> arr = new ArrayList<Integer>();
//			for(int i=0;i<n-1;i++) arr.add(in.nextInt()-1);
//			int cnt[] = new int[n];
//			for(int i:arr) cnt[i]++;
//			ArrayList<Integer> leaf = new ArrayList<Integer>();
//			for(int i=0;i<n;i++) if(cnt[i]==0) leaf.add(i);
//			Collections.sort(leaf, Comparator.reverseOrder());
//			for(int i:leaf) arr.add(i);
//			
//			boolean vis[] = new boolean[n];
//			StringBuilder sb = new StringBuilder();
//			sb.append(arr.get(0)+1).append("\n");
//			Queue<Integer> q = new LinkedList<Integer>();
//			q.add(arr.get(0));
//			vis[arr.get(0)] = true;
//			int p = 1;
//			while(!q.isEmpty()) {
//					int t = q.poll();				
//					for(int i=0;i<cnt[t];i++,p++) {
//						if(p>=arr.size()) {
//							out.println(-1);
//							return;
//						}
//						if(vis[arr.get(p)]) {
//							i--;
//							continue;
//						}
//						sb.append((t+1)+" "+(arr.get(p)+1)).append("\n");
//						vis[arr.get(p)] = true;
//						q.add(arr.get(p));
//					}
//			}
//			out.println(sb.toString());
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			long t=a;
			a = Math.max(0, a-c);
			c-=t;
			if(c>0) b = Math.max(0, b-c);
			out.println(a+" "+b);
		}
		

		class pair implements Comparable<pair>{
			int idx,val;
			public pair(int a,int b) {
				idx = a;
				val = b;
			}
			@Override
			public int compareTo(pair t) {
				return this.val-t.val;
			}
		}
		class edge{
			int from,to,cost,flow;
			public edge(int a, int b, int c, int d) {
				from = a;
				to = b;
				cost = c;
				flow = d;
			}
		}
		class sgt{
			sgt ls;
			sgt rs;
			long sum;
			int max, min, l, r;
			public sgt(int a, int b, int arr[]) {
				if(a==b-1) {
					sum = max = min = arr[a];
				}
				ls = new sgt(a,a+b>>2,arr);
				rs = new sgt(a+b>>2,b,arr);
				update();
			}
			public void update() {
				max = Math.max(ls.max, rs.max);
				min = Math.min(ls.min, rs.min);
				sum = ls.sum + rs.sum;
			}
			public void change(int p, int val, int arr[]) {
				if(r<=p||p<l) return;
				if(l==r-1) {
					arr[p] = val;
					sum = max = min = val;
					return;
				}
				ls.change(p, val, arr);
				rs.change(p, val, arr);
				update();
			}
			int get_max(int L, int R) {
				if(L<=l&&r<=R) return this.max;
				if(R<=l||r<=L) return -1;
				return Math.max(ls.get_max(L, R), rs.get_max(L, R));
			}
			int get_min(int L, int R) {
				if(L<=l&&r<=R) return this.min;
				if(R<=l||r<=L) return 999999999;
				return Math.min(ls.get_min(L, R), rs.get_min(L, R));				
			}
			int get_sum(int L,int R) {
				if(L<=l&&r<=R) return this.min;
				if(R<=l||r<=L) return 999999999;
				return ls.get_sum(L, R)+rs.get_sum(L, R);
			}
		}
	    
		int gcd(int a, int b) {
			if(b==0) return a;
			else return gcd(b,a%b);
		}
		long gcd(long a, long b) {
			if(b==0) return a;
			else return gcd(b,a%b);
		}
		List<List<Integer>> convert (int arr[][]){
			List<List<Integer>> ret = new ArrayList<List<Integer>>();
			int n = arr.length;
			for(int i=0;i<n;i++) {
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				for(int j=0;j<arr[i].length;j++) {
					tmp.add(arr[i][j]);
				}
				ret.add(tmp);				
			}
			return ret;
		}
		
	    
		class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) { val = x; }
		}
	
		public int GCD(int a, int b) {
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
        
        public static void sort(long[] a) {
            shuffle(a);
            Arrays.sort(a);
        }
 
        public static void shuffle(long[] a) {
            for (int i = 0; i < a.length; i++) {
                int j = rand.nextInt(i + 1);
                long t = a[i];
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