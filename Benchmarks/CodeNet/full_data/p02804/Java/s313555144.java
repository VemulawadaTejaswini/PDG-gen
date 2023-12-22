import java.util.*;
	
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
	 static long[] kaiinv;
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        long ans=0;
        for(int i=0;i<N;i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
//        System.out.println(sum);
/*
        if(A[0]<0) {
        	long c=A[0];
        	for(int i=0;i<N;i++) {
        		A[i]=A[i]+c;
        	}
        }
*/       
        kaijo = new long[N+100];
        kaijo[0]=1;
        for(int i=1;i<=N+88;i++) {
        	kaijo[i]=(kaijo[i-1]*i)%mod;
        }
        kaiinv = new long[N+100];
        kaiinv[0]=1;
        kaiinv[1]=1;
        for(int i=2;i<N+88;i++) {
        	kaiinv[i]=modinv(kaijo[i])%mod;
        }
        
//        System.out.println(nCr(10,3));
        		
        long maxS=0;
        long minS=0;
        for(int i=0;i<N;i++) {
        	maxS=(maxS+ A[i]*nCr(i,K-1))%mod;
        }
        for(int i=0;i<N;i++) {
        	minS=(minS+ A[i]*nCr(N-i-1,K-1))%mod;
        }
        ans=(maxS-minS+mod)%mod;
        System.out.println(ans);
    }
 
	static long nCr(int n, int r) {
		if(n<r) {
			return 0;
		} else {
			return (kaijo[n]*(kaiinv[r]*kaiinv[n-r]%mod))%mod;
		}
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
}