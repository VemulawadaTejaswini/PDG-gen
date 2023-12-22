	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        
	        int N = sc.nextInt();	
	        int[] a = new int[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Integer.parseInt(sc.next());
	        }
	        long ans=1;
	        long cnt=1;
	        for(int i=0;i<N;i++) {
	        	if(a[i]==cnt)cnt++;
	        }
	        for(int i=N-1;i>=0;i--) {
	        	if(a[i]==N-ans+1)ans++;
	        }
	        ans=N-Math.max(ans, cnt)+1;
	        
	        
	        System.out.println(ans);
	    }
	}