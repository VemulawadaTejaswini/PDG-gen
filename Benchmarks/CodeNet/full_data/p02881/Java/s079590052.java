
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
        long N  = sc.nextLong();
        ArrayList<Long> prime = divisorX(N);
        long min = N;
        for(int i=0;i<prime.size();i+=2){
            min=Math.min(min,prime.get(i)+prime.get(i+1));
        }
        System.out.println(min-2);
    }

    public static final ArrayList<Long> divisorX(final long n) {
		final ArrayList<Long> list = new ArrayList<Long>();

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