import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
   	 static int a_dist[];
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long N = sc.nextLong();
	        if(N==2) {
	        	System.out.println(1);
	        	return;
	        }
	        long H = (long)Math.pow(N,0.5);
	        long[] d = new long[(int)H+5];
	        int k=0;
	        for(long i=2;i<=H;i++) {
	        	if(N%i==0) {
	        		d[k]=i;
	        		k++;
	        		if(i*i!=N) {
		        		d[k]=N/i;
		        		k++;
	        		}
	        	}
	        }
		    d[k]=N;	        	
	        long ans=0;
	        H = (long)Math.pow(N-1,0.5);
	        for(long i=2;i<=H;i++) {
	        	if((N-1)%i==0) {
	        		ans++;
	        		if(i*i!=(N-1)) {
	        			ans++;
	        		}
	        	}
	        }
	        ans++;
	        for(int i=0;d[i]!=0;i++) {
	        	long tmp=N;
	        	while(tmp>0) {
	        		if(tmp%d[i]==0) {
	        			tmp=tmp/d[i];
	        			if(tmp==1) {
	        				ans++;
	        				break;
	        			}
	        		} else {
	        			if((tmp-1)%d[i]==0) {
	        				ans++;
	        				break;
	        			} else {
	        				break;
	        			}
	        		}
	        	}
	        }
	        
	    	System.out.println(ans);
	        
	        	        	        
	 }
}