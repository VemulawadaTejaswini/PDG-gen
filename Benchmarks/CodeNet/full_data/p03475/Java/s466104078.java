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
       
       int[] m=new int[N];
       int sum=0;
       for(int i=0;i<N-1;i++) {
    	   sum=Math.max(sum+sum%f[i], s[i]);
    	   m[i]=sum-s[i];
    	   sum=sum+c[i];
       }
       
       int[] z=new int[N];
       for(int i=0;i<N-1;i++) {
    	   z[i]=sum-m[i];
       }
       int max=0;
       for(int i=N-2;i>=0;i--) {
    	   max=Math.max(max,z[i]);
    	   z[i] =max;
       }       
       
       for(int i=0;i<N-1;i++) {
    	   System.out.println(z[i]);
       }
	   System.out.println(0);
   }
}