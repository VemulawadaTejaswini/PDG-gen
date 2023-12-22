import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
	   int H=(int) (Math.pow(10,5)+7);
       int[] m = new int[H];
       int[] p = new int[H];
       int k=0;
       for(int i=2;i<H;i++) {
       	if(m[i]==0) {
       		m[i]=-k-1;
       		p[k]=i;
       		k++;
       		for(int j=i;j<H;j=j+i) {
       			m[j]=k;
       		}
       	}
       }
       
	   Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       int  K = sc.nextInt();
       long[] a = new long[N];
       long max=0;
       long min= (int) (Math.pow(10,9)+7);
       for (int i=0 ; i<N; i++) {
           a[i] = Long.parseLong(sc.next());
           max=Math.max(max, a[i]);
           min=Math.min(min, a[i]);
           if(K==a[i]) {
        	   System.out.println("POSSIBLE");
        	   return;
           }
       }
       if(K>max) {
    	   System.out.println("IMPOSSIBLE");
    	   return;
       }
       long gcd=GCD(a[0],a[1]);
       for(int i=2;i<N;i++) {
    	   gcd=GCD(gcd,a[i]);
       }
       if(K%gcd==0) {
    	   System.out.println("POSSIBLE");
       } else{
    	   System.out.println("IMPOSSIBLE"); 
       }
       return;
   }
   static long GCD(long a,long b) {
		  long tmp;
		  long r;
		  if(a<b) {
			  tmp = a;
			  a = b;
			  b = tmp;				  
		  }
		  
		  r = a % b;
		  while(r!=0) {
			  a=b;
			  b=r;
			  r=a%b;
		  }
		  
		  return b;
	  }
	  
}