import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] ap= new int[N][1000000];
        
        
        
        long[] a = new long[(int)N];
        long[] s = new long[(int)N];
        for (int i=0 ; i<N; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for (int i=0 ; i<N; i++) {
            s[i] = modinv(a[i]);
        }
        
        boolean[] m = new boolean[1000000];
        int[] p = new int[1000000];
        int k=0;
        for(int i=2;i<1000;i++) {
        	if(m[i]==false) {
        		p[k]=i;
        		k++;
        		for(int j=i;j<1000;j=j+i) {
        			m[j]=true;
        		}
        	}
        }
        
        long tmp=0;
        long gcm=1;
        for(int i=0;i<N;i++) {
        	tmp=a[i];
    		for(int j=0;j<k;j++) {
    			if(tmp%p[j]==0) {
    				while(tmp%p[j]==0) {
    					tmp=tmp/p[j];
            			ap[i][j]++;
    				}
    			}
        	}
    		if(tmp!=1&&(i==0||a[i-1]!=a[i])) {
    			gcm=gcm*tmp%mod;
    		}
        }
        
        int[] max= new int[1000000];
        for(int i=0;i<k;i++) {
        	for(int j=0;j<N;j++) {
        		max[i]=Math.max(max[i], ap[j][i]);
        	}
        	gcm=(long) (gcm*(Math.pow(p[i],max[i]%mod))%mod);
        }
        
        
        long sum=0;
        for(int i=0;i<N;i++) {
        	sum=(sum+gcm*s[i])%mod;
        }
        
        System.out.println(sum);  	
               		
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