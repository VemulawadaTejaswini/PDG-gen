	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next())-1;
	        }
	        Unionfind uf = new Unionfind(N);
	        for (int i=0 ; i<M; i++) {
	        	int ai = sc.nextInt()-1;
	        	int b = sc.nextInt()-1;      	
	            uf.union(ai,b);
	        }
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	if(uf.same(i, (int)a[i]))ans++;
	        }
	        
	        System.out.println(ans);
	    }
	}

	 class Unionfind {
		 
			private int[] data;
			private int []size;
			
			public Unionfind(int size) {
				this.data = new int [size];
				this.size = new int [size];
				for(int i = 0 ;i < size ;i++) {
					initnode(i);
				}
				clear();
			}
			
			public void initnode(int i) {
				size[i] = 1;
			}
			
			public void clear() {
				Arrays.fill(data, -1);
			}
			
			public void union(int x , int y ) {
				if((x = root(x)) != (y = root(y))) {
					if(data[y] < data[x]) {
						final int t = x;
						x = y;
						y = t;
					}
					data[x] += data[y];
					size[root(x)] += size[root(y)];
					data[y] = x;
				}
			}
			
			public int getSize(int i) {
				return size[root(i)];
			}
			
			public int root(int x) {
				if(data[x] < 0) {
					return x;
				}
				else {
					return data[x] = root(data[x]);
				}
			}
			
			public boolean same(int x, int y) {
				return root(x) == root(y);
			}
			
		}
