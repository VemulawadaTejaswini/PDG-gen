import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        long[] mp= new long[K+5];
	        
	        long ans=0;

	        
	        mp[0]=1;
	        for(int i=1;i<=K;i++) {
	        	mp[i-1]=i;
	        	for(int j=1;j<i;j++) {
	        		if(i%j==0) {
	        			mp[i-1]=mp[i-1]-mp[j-1];
	        		}
	        	}
	        }
	        for(int i=1;i<=K;i++) {
	        	long tmp=K/i;
	        	ans = ans + (mp[i-1]*pow(tmp,N)%mod)%mod;
	        }
	    	System.out.println(ans);
	        
	        	        	        
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
}