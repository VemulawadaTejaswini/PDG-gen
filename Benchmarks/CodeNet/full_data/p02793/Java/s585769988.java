import java.util.*;
public class Main { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long o=0;
       int n=sc.nextInt();
       long g=1;
       long[] a=new long[n];
       for(int i=0;i<n;i++){
         a[i]=sc.nextLong();
         g=lcm(a[i],g);
       }
       g%=1000000007;
       long b=0;
       for(int i=0;i<n;i++){
         long bi=g/a[i];
         //long bi=g*modinv(a[i],1000000007);
         bi%=1000000007;
         b+=bi;
         b%=1000000007;
       }
       o=b%1000000007;
      //System.out.println(modinv(2,13));
      System.out.println(o);
    }
  
 static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
  }
  
  static long modinv(long a,long m){
  	long b=m,u=1,v=0;
    
    while(b>0){
    	long t=a/b;
        a-=t*b;
        long a2=a;a=b;b=a2;
        u-=t*v;
        long u2=u;u=v;v=u2;
        u %= m; 
        if (u < 0) u += m;
        return u;
    }
    return 1;
  }
}