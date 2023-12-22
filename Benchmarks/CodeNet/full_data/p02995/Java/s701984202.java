import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int cd = lcm(c,d);
	System.out.print(b-a+1-(b/c - (a-1)/c + b/d - (a-1)/d - b/cd + (a-1)/cd));
    }
    static int gcd(int m, int n) {
	if (m < n) {
	    int tmp = m;
	    m = n;
	    n = tmp;
	}
	int rem = 0;
	while ((rem = m%n) != 0) {
	    m = n;
	    n = rem;
	}
	return n;
    }
    static int lcm(int m, int n) {
	return m * n / gcd(m, n);
    }
}
