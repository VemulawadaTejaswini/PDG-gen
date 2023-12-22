import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long n = gcd(a, b);

		int size = factorize(n);
		System.out.println(size + 1);

	}

	static long gcd(long x, long y) {
		if (y == 0) return x;
		return gcd(y, x % y);
	}

  private static int factorize(long n) {
    Set<Long> set = new HashSet<>();
     for(long i = 2; i * i <=n; i++) {
        while (n % i == 0) {
          set.add(i);
          n /= i;
          }
     }
     if(n > 1) set.add(n);
     return set.size();
    }
}
