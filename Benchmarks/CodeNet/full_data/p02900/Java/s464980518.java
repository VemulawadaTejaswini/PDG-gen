
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        HashSet<Long> hsA=primeFactor(A);
        HashSet<Long> hsB=primeFactor(B);

        hsA.add(1l);
        hsB.add(1l);

        HashSet<Long> ans = new HashSet<Long>();

        Iterator ite = hsA.iterator();
        while(ite.hasNext()){
            long num = (long)ite.next();
            if(hsB.contains(num)){
                ans.add(num);
            }
        }

        System.out.println(ans.size());
    }

    public static final HashSet<Long> primeFactor(long n) {
		final HashSet<Long> list = new HashSet<Long>();
		if (n < 2) { 
			return list;
		}

		while (n != 1 && n % 2 == 0) { 
			list.add(2l);
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

}