import java.util.*;
public class Main {
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static long fac(long x){
        if(x==0) return 1;
        return x*fac(x-1);
    }
    public static long per(long x,long y){
        return fac(x)/fac(x-y);      
    }
    public static long com(long x,long y){
        return per(x,y)/fac(y);      
    }
    public static long com2(long x,long y){
        if(y==0 || y==x) return 1;
        if(x < y) return 0;
        return com2(x-1,y-1)+com2(x-1,y);
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();       
		long [] in = new long [a]; 
        long [] l = new long [a+1];
        long [] r = new long [a+1];
        long [] ans = new long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		l[0]= 0;
        r[a]= 0;
        for(int i=1;i<=a;i++){l[i]=gcd(l[i-1],a[i]);}
        for(int i=a-1;i>=0;i--){r[i]=gcd(r[i+1],a[i]);}
        for(int i=0;i<a;i++){ans[i]=gcd(l[i],r[i+1])}
        long b = 0;
        for(int i=0;i<a;i++){b=Math.max(b,ans[i]);                                              
                            }       
		System.out.println(b);
	}
}