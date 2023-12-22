	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long[] b = new long[N];
	        long[] c = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        for (int i=0 ; i<N; i++) {
	            b[i] = Long.parseLong(sc.next());
	        }
	        for (int i=0 ; i<N; i++) {
	            c[i] = Long.parseLong(sc.next());
	        }
	        Arrays.parallelSort(a);
	        Arrays.parallelSort(b);
	        Arrays.parallelSort(c);
	        long[] d = new long[N];
	        long[] e = new long[N];
	        long[] f = new long[N];
	        for(int i=0;i<N;i++) {
	        	int low = -1;
	        	int hi = N;
	        	while(hi-low>1) {
	        		int mid = low+(hi-low)/2;
	        		if(a[i]>=b[mid]) low=mid;
	        		else hi=mid;	
	        	}
	        	d[i]=hi;
	        }
	        for(int i=0;i<N;i++) {
	        	int low = -1;
	        	int hi = N;
	        	while(hi-low>1) {
	        		int mid = low+(hi-low)/2;
	        		if(b[i]>=c[mid]) low=mid;
	        		else hi=mid;	
	        	}
	        	e[i]=N-hi;
	        }
	        f[N-1]=e[N-1];
	        for(int i=N-2;i>=0;i--) {
	        	f[i]=f[i+1]+e[i];
	        }
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	if(d[i]<N)ans=ans+f[(int) d[i]];
	        }
	    	System.out.println(ans);
	    	
	        		
	    }
	    

	}