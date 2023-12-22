import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       

       int[] c = new int[N];
       int[] s = new int[N];
       int[] f = new int[N];
       for (int i=0 ; i<N-1; i++) {
           c[i] = sc.nextInt();
           s[i] = sc.nextInt();
           f[i] = sc.nextInt();
       }
       
       int sum=0;
       int[] ans=new int[N];
       for(int i=0;i<N-1;i++) {
    	   sum=0;
           for(int j=i;j<N-1;j++) {
        	   int tmp=0;
        	   if(sum%f[j]!=0) {
        		   tmp=f[j]-sum%f[j];
        	   }
        	   sum=Math.max(sum+(tmp), s[j]);
        	   sum=sum+c[j];        	   
           }
           ans[i]=sum;
       }
       
       for(int i=0;i<N;i++) {
    	   System.out.println(ans[i]);
       }
   }
}