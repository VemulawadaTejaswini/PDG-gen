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
    public static long per(long x,long y,long z){
        if(y==0) return 1;
        return (per(x,y-1)*(x-y+1))%z;
    }   
    public static long pow(long x,long y,long z){
        if(y==0) return 1;
        if(y%2==1) return (pow(x,y-1,z)*x)%z;
        return Math.pow(pow(x,y/2,z),2)%z;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long [] [] pascal = new long [51][51];
        for(int i=0;i<=50;i++){
        for(int j=0;j<=i;j++){if(j==0 || j==i){pascal[i][j]=1;}
                              else{pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];}
                             }
        }
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
		long mod = 1000000007;
        long ans = pow(2,n,mod)-1;
        long A = (per(n,a,mod)*pow(per(a,a,mod),mod-2,mod))%mod;
        long B = (per(n.b,mod)*pow(per(b,b,mod),mod-2,mod))%mod;
        ans=(ans-A-B)%mod;
		System.out.println(ans);
	}
}
