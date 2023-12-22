import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		System.out.println(b-a+1 - div(a,b,c) - div(a,b,d) + div(a,b,c*d/gcd(c,d)));
	}
	static long div(long x, long y, long z){
		return y / z - (x-1) / z;
	}
	static long gcd(long a, long b){
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		else return gcd(b, a % b);
	}
}
