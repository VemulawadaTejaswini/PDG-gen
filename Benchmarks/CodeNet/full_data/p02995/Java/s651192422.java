import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;
    int MAX_M = 100000;
    int MAX_N = 100000;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        A--;
        long B = sc.nextLong();
        long C = sc.nextLong();
        long c = (B/C) - (A/C);
        long D = sc.nextLong();
        long d = (B/D) - (A/D);
        long L = lcm(C,D);
        long l = (B/L) - (A/L);
        System.out.println((B-A)-c-d+l);

    }
    static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (c/b);
}
}