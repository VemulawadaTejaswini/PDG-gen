import java.util.Scanner;

public class Main {
	public static long gcd(long a, long b){
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0) return a;
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());
        a -= 1;

        long lcm = c * d / gcd(c,d);
        long n = b - (b/c) - (b/d) + (b/lcm);
        long m = a - (a/c) - (a/d) + (a/lcm);
        System.out.println(n-m);
	}
}
