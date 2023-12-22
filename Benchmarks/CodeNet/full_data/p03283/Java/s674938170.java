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
	        int Q = sc.nextInt();
	        long[][] m1 = new long[N][N];
	        long[][] m2 = new long[N][N];
	        
	        for(long i=0;i<M;i++) {
	        	int l = sc.nextInt()-1;
	        	int r = sc.nextInt()-1;
	        	m1[l][r]++;
	        }
	        
	        for(int i=0;i<N;i++) {
	        	for(int j=0;j<N;j++) {
	        		for(int k=i;k>=0;k--) {
	        			m2[k][j]=m2[k][j]+m1[i][j];
	        		}
	        	}
	        }
	        for(int i=0;i<N;i++) {
	        	for(int j=1;j<N;j++) {
	        		m2[i][j]=m2[i][j]+m2[i][j-1];
	        	}
	        }
	        
	        long[] ans = new long[Q];
	        for(int i=0;i<Q;i++) {
	        	ans[i]=m2[sc.nextInt()-1][sc.nextInt()-1];
	        }
	        		
	        for(int i=0;i<Q;i++) {
	        	System.out.println(ans[i]);
	        }
	        
		 }

	}