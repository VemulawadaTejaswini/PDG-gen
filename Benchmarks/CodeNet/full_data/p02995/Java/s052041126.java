import java.util.Scanner;

public class Main {
	static long gcd(long a, long b) {
		if(a%b!=0) {
			return gcd(b,a%b);
		}else {
			return b;
		}
	}
	static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong()-1;
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long count = 0;
        long l=lcm(c,d);
        long bl=b/l;
        long bwaruc= b/c;
        long bwarud= b/d;
        long ansb = b-(bwaruc+bwarud)+bl;
        long al=a/l;
        long ansa = a-(a/c+a/d)+al;
        
        count=ansb-ansa;
        System.out.println(count);
    }
}
