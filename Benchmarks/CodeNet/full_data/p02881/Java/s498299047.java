
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
        //System.out.println(Arrays.toString(prime.toArray()));
        long min = Long.MAX_VALUE;
        long q1 = 0;
        long q2 = 0;
        for(int i=1;i<prime.size();i+=2){
            if(prime.get(i-1)+prime.get(i) < min){
                min = prime.get(i-1)+prime.get(i);
                q1 = prime.get(i-1);
                q2 = prime.get(i);
            }
        }
        // System.out.println(q1);
        // System.out.println(q2);
        System.out.println(min-2);
    }

    public static final ArrayList<Long> divisorX(final long n) {
		final ArrayList<Long> list = new ArrayList<Long>();

		for (long i = 1l; i * i <= n; i++) {
			if (n % i == 0l) {
				list.add(i);
				list.add(n / i);
			}
		}
		return list;
	}
}