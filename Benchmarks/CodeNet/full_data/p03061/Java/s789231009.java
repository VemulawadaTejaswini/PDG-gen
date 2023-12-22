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
	        
	        long[] gcd1 = new long[N];
	        long[] gcd2 = new long[N];
	        gcd1[0]=a[0];
	        gcd2[N-1]=a[N-1];
	        
	        for(int i=1;i<N;i++) {
	        	gcd1[i]=GCD(gcd1[i-1],a[i]);
	        }
	        for(int i=N-2;i>=0;i--) {
	        	gcd2[i]=GCD(gcd2[i+1],a[i]);
	        }
	        long ans=0;
	        for(int i=1;i<N-1;i++) {
	        	long tmp = GCD(gcd1[i-1],gcd2[i+1]);
	        	ans=Math.max(ans, tmp);
	        }
	        ans=Math.max(ans, gcd1[N-2]);
	        ans=Math.max(ans, gcd2[1]);
	        
	        System.out.println(ans);
	    }
		  static long GCD(long a,long b) {
			  long tmp;
			  long r;
			  if(a<b) {
				  tmp = a;
				  a = b;
				  b = tmp;				  
			  }
			  
			  r = a % b;
			  while(r!=0) {
				  a=b;
				  b=r;
				  r=a%b;
			  }
			  
			  return b;
		  }
	}