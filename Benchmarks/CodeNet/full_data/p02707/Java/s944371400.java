import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long[] ans=new long[N];
	        long sum =0;
	        for (int i=0 ; i<N-1; i++) {
	            a[i] = Long.parseLong(sc.next());
	            ans[(int)a[i]-1]++;
	        }
	        
	        for(int i=0;i<N;i++) {
	        	System.out.println(ans[i]);
	        }
	        
	 }

}