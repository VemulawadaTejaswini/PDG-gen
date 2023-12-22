	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long ave =0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next())-(i+1);
	        }
	        Arrays.sort(a);
	        
	        long ans=Long.MAX_VALUE;
	        for(int i=Math.max(N/2-1, 0);i<Math.max(N/2+2, N);i++) {
	        	long t = a[i];
	        	long tmp=0;
	        	for(int j=0;j<N;j++) {
		        	tmp=tmp+Math.abs(a[j]-t);	        		
	        	}
	        	ans=Math.min(ans,tmp);
	        }
	        System.out.println(ans);
	        
	    }
	}
