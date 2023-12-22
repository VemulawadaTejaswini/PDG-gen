import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       int  M = sc.nextInt();
       int[] a = new int[N];
       Arrays.fill(a, -1);
       boolean flg=false;
       for(int i=0;i<M;i++) {
    	   int keta=sc.nextInt();
    	   int su=sc.nextInt();
    	   if(a[N-keta]==-1) {
    		   if(keta==1&&su==0) {
    			   flg=true;
    		   } else {
        		   a[N-keta]=su;    			   
    		   }
    	   } else {
    		   if(a[N-keta]!=su) {
    			   flg=true;
    		   }
    	   }
       }
       int ans=0;
       int tmp=0;
       int keta=1;
       for(int i=0;i<N;i++) {
    	   if(a[i]==-1) {
    		   if(i==N-1) {
    			   tmp=1;
    		   } else {
    			   tmp=0;
    		   }
    	   } else {
    		   tmp=a[i];
    	   }
    	   ans=ans+tmp*keta;
    	   keta=keta*10;
       }
       if(flg==true) {
    	   ans=-1;
       }
       System.out.println(ans);
   }
}