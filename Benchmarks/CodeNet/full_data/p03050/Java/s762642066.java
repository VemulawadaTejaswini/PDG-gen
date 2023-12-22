import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;

        // ArrayList<Long> rs = new ArrayList<Long>(primeFactor(N));
        ArrayList<Long> rs = new ArrayList<Long>(divisorX(N));
        // rs.add(1L);
        ArrayList<Long> ms = new ArrayList<Long>();

        // System.out.println(Arrays.toString(rs.toArray()));

        // for (long i = 1; i <= N; i++) {
        // if (N % i == 0) {
        // sum += N / i - 1;
        // }
        // }

        for (Long i : rs) {
            if(i-1==0)continue;
            if (N / (i-1) == N % (i-1)) {
                sum+=i-1;
            }
            // if ((N % i) == 0) {
            //     sum += N / i - 1;
            // }
        }
        // if(N%1==N/1)sum+=1;

        System.out.println(sum);
    }

    public static final List<Long> primeFactor(long n) {
        final List<Long> list = new ArrayList<Long>();
        if (n < 2) {
            return list;
        }

        while (n != 1 && n % 2 == 0) {
            list.add(2L);
            n >>>= 1;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }

        if (n != 1) {
            list.add(n);
        }
        return list;
    }

    public static final List<Long> divisorX(final long n) {
		final List<Long> list = new ArrayList<Long>();

		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				if (i != n / i) {
					list.add(n / i);
				}
			}
		}
		return list;
	}
}
