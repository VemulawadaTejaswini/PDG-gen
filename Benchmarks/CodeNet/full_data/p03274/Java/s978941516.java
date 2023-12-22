import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	          
	   Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       int  K = sc.nextInt();
       long[] a = new long[N];
       long max=0;
       int t=0;
       for (int i=0 ; i<N; i++) {
           long tmp = Long.parseLong(sc.next());
           if(tmp==0) {
        	   K--;
           } else {
        	   a[t]=tmp;
        	   t++;
           }
       }
       Arrays.sort(a);
       int cnt=-1;
       for(int i=0;i<N;i++) {
    	   if(a[i]>=0)break;
    	   else cnt++;
       }
       if(K==0) {
    	   System.out.println(0);
    	   return;
       }
       Long min=0l;
       if(cnt+K>N-1) {
    	   min=Long.MAX_VALUE;
       } else {
           min=a[cnt+K];    	   
       }
       for(int i=1;i<=K;i++) {
    	   if(cnt-i<0)break;
    	   if(cnt+K-i>N-1)continue;
    	   long tmp=a[cnt+K-i]-2*a[cnt-i+1];
    	   min=Math.min(min, a[cnt+K-i]-2*a[cnt-i+1]);
       }
 
       System.out.println(min); 
       return;
   }

}
