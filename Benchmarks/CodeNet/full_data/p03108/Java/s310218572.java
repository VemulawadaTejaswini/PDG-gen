	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int[] a = new int[M];
	        int[] b = new int[M];
	        for (int i=0 ; i<N; i++)list.add(new ArrayList<Integer>());
	        for (int i=0 ; i<M; i++) {
	            a[i] = sc.nextInt()-1;
	            b[i] = sc.nextInt()-1;
	        	list.get(a[i]).add(b[i]);
	        	list.get(b[i]).add(a[i]);	            
	        }
	        
	        int cnt=N*(N-1)/2;
	        int[] ans = new int[M];
	        ans[M-1]=cnt;
	        Unionfind u = new Unionfind(N);
	        for(int i=M-1;i>=1;i--) {
	        	if(!u.same(a[i],b[i])) {
	        		cnt=cnt-u.getSize(a[i])*u.getSize(b[i]);
	        		u.union(a[i],b[i]);
	        	}
	        	ans[i-1]=cnt;
	        }
	        for(int i=0;i<M;i++) {
	        	System.out.println(ans[i]);
	        }
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