import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int N;
	 static int K;
	 static long[]a;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       K = sc.nextInt();

       a = new long[(int)N];
       long max=0;
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
           max=Math.max(max, Math.abs(a[i]));
       }

       Arrays.sort(a);
       
       long left=0;
       long right=0;
	   right=Math.abs(max)*Math.abs(max);
	   left=-1*Math.abs(max)*Math.abs(max);
	   while(right-left>1) {
		   long mid=left+(right-left)/2;
		   if(IsOK(mid)) right=mid;
		   else left=mid;
	   }
       

       System.out.println(right);
   }
   
   public static boolean IsOK(long p) {
	   long cnt=0;
	   for(int i=0;i<N;i++) {
		   if(a[i]>0) {
			   int left=-1;
	    	   int right=N;
	    	   while(right-left>1) {
	    		   int mid=left+(right-left)/2;
	    		   if(a[i]*a[mid]<=p) left=mid;
	    		   else right=mid;
	    	   }
		       cnt=cnt+right;
		   } else if(a[i]==0){
			   if(p>=0)cnt=cnt+N;
		   } else {
			   int left=-1;
	    	   int right=N;
	    	   while(right-left>1) {
	    		   int mid=left+(right-left)/2;
	    		   if(a[i]*a[mid]<=p) right=mid;
	    		   else left=mid;
		       }
		       cnt=cnt+N-right;			   
		   }
	   }
	   for(int i=0;i<N;i++) {
		   if(a[i]*a[i]<=p)cnt--;
	   }
	   return cnt/2>=K;
   }
}