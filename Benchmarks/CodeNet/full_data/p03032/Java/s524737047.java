import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();
//       String S = sc.next();
//       char[] c = S.toCharArray();
       
       long[] a = new long[(int)N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       
       long ans=0;
       for(int i=0;i<K;i++) {
    	   for(int j=0;j<K-i;j++) {
    	       long[] m = new long[N];
    		   if(i+j>N)continue;
    		   int d=K-i-j;
    		   long now=0;
    		   int cnt=0;
    		   for(int l=0;l<i;l++) {
    			   m[cnt]=a[l];
    			   now=now+a[l];
    			   cnt++;
    		   }
    		   for(int r=0;r<j;r++) {
    			   m[cnt]=a[a.length-r-1];
    			   now=now+a[a.length-r-1];
    			   cnt++;
    		   }
    		   Arrays.sort(m);
    		   for(int n=0;n<d;n++) {
    			   if(m[n]>=0)break;
    			   now=now-m[n];
    		   }
    		   ans=Math.max(ans, now);
    		   
    	   }
       }
 
       System.out.println(ans);
   }
      

}