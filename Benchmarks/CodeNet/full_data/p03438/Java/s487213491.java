import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long[] b = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        for (int i=0 ; i<N; i++) {
	            b[i] = Long.parseLong(sc.next());
	        }
	        for (int i=0 ; i<N-1; i++) {
	            if(a[i]>b[i]) {
	            	a[N-1]=a[N-1]+2*(a[i]-b[i]);
	            } else {
	            	b[N-1]=b[N-1]+(b[i]-a[i])/2;
	            }
	        }
	        if(b[N-1]<a[N-1]) {
	        	System.out.println("No");
	        } else {
	        	System.out.println("Yes");
	        }
	        
	        
	        
	 }

}