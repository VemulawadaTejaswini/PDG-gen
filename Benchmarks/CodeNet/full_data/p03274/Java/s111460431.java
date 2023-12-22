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
       long[] a = new long[N+1];
       long max=0;
       boolean flg=false;
       int cn=0;
       int t=0;
       for (int i=0 ; i<N; i++) {
           long tmp = Long.parseLong(sc.next());
           if(tmp<0) {
        	   tmp=tmp;
           } else {
        	   if(flg==false) {
        		   if(tmp==0) {
        			   K--;
        			   flg=true;
        			   cn=t;
        		   } else {
            		   cn=t;
            		   a[t]=0;
            		   t++;
            		   flg=true;        			   
        		   }
        	   }
           }
           a[t]=tmp;
           t++;
       }
       if(flg==false) {
    	   a[t]=0;
    	   t++;
       }
       Long min=Long.MAX_VALUE;
       for(int i=0;i<t;i++) {
    	   if(cn+K-i>t-1)continue;
    	   if(cn-i<0)continue;
    	   min=Math.min(min, a[cn+K-i]+a[cn-i]*(-2));
       }
       for(int i=0;i<t;i++) {
    	   if(cn+i>t-1)continue;
    	   if(cn-K+i<0)continue;
    	   min=Math.min(min, a[cn+i]*2+a[cn-K+i]*(-1));
       }
       System.out.println(min); 
       return;
   }

}