	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
        	long now=0;
        	StringBuffer ans = new StringBuffer();
	        for (int i=N-1 ; i>=0; i--) {
	        	if(a[i]>=now) {
	        		while(now<a[i]) {
	        			now++;
		        		ans.append(now);
		        		ans.append("\n");
	        		}
	        		now--;
	        	} else {
	        		System.out.println(-1);
	        		return;
	        	}
	        }

	        if(now==0) {
		        System.out.print(ans);	        	
	        } else {
        		System.out.println(-1);	        	
	        }
	    }
	}