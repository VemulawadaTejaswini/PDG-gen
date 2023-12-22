import java.util.*;
	
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        long[] ncr = new long[N];
        long[] sum = new long[N];
        long ans=0;
        for(int i=0;i<N;i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        
        long maxS=0;
        long minS=0;
        for(int i=0;i<N;i++) {
        	maxS=maxS+ A[i]*nCr(i,K-1)%mod;
        }
        for(int i=0;i<N;i++) {
        	minS=minS+ A[i]*nCr(N-i-1,K-1)%mod;
        }
        
 //       System.out.println(maxS);
 //       System.out.println(minS);

        
        System.out.println((maxS-minS)%mod);
    }

	public static long pow(long a,long n) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%mod;
	        }
	        a=(a*a)%mod;
	        n>>=1;
	    }
	    return res;
	}
 
	public static long modinv(long n) {
		return pow(n, mod-2);
	}
 
	public static long nCr(long n, long r) {
		if(n<r) {
			return 0;
		} else {
			return factorial(n) * modinv(factorial(n-r)) % mod * modinv(factorial(r)) % mod;
		}
	}
	public static long factorial(long n) {
		long tmp = 1;
		for (long i=n;i>0;i--) {
			tmp = (tmp*i)%mod;
		}
		return tmp;
	}
}