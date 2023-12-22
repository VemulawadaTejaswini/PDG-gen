import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();
    	long a=sc.nextLong();
    	for(int i=1;i<N;i++){
    		long b=sc.nextLong();
    		long gcd=getGCD(a,b);
    		a=getLCM(a,b,gcd);
    	}
    	System.out.println(a);
    }
    private static long getGCD(long m, long n) {
    	long r;
    	if(m<n){
    		long buffer=m;
    		m=n;
    		n=buffer;
    	}
    	r=m%n;
    	while(r!=0){
    		m=n;
    		n=r;
    		r=m%n;
    	}
    	return n;
    }
    private static long getLCM(long m, long n, long gcd) {
    	return m/gcd*n;
    }
}