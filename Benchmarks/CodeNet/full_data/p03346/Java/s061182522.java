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
	            a[Integer.parseInt(sc.next())-1] = i;
	        }
	        long ans=1;
	        long cnt=1;
	        for(int i=0;i<N;i++) {
	        	if(i!=N-1&&a[i]<a[i+1])cnt++;
	        	else {
	        		ans=Math.max(ans, cnt);
	        		cnt=1;
	        	}
	        }
	        ans=Math.max(ans, cnt);
	        ans=N-ans;
	        
	        
	        System.out.println(ans);
	    }
	}