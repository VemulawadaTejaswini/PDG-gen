	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        Arrays.parallelSort(a);
	        long ans=0;
	        if(N%2==0) {
		        for(int i=0;i<N/2-1;i++) {
		        	ans=ans-2*a[i];
		        }
		        ans=ans-a[N/2-1];
		        ans=ans+a[N/2];
		        for(int i=N/2+1;i<N;i++) {
		        	ans=ans+2*a[i];
		        }
	        } else {
	        	for(int i=0;i<N/2;i++) {
	        		ans=ans-2*a[i];
	        	}
	        	ans=ans+a[N/2];
	        	ans=ans+a[N/2+1];
	        	for(int i=N/2+2;i<N;i++) {
	        		ans=ans+2*a[i];
	        	}
	        	long tmp=0;
	        	for(int i=0;i<N/2-1;i++) {
	        		tmp=tmp-2*a[i];
	        	}
	        	tmp=tmp-a[N/2-1];
	        	tmp=tmp-a[N/2];
	        	for(int i=N/2+1;i<N;i++) {
	        		tmp=tmp+2*a[i];
	        	}
	        	ans=Math.max(ans, tmp);
	        }
	        
	        
	        System.out.println(ans);
	        
	    }
	}