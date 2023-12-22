
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = 1;
        while(m * m <= n) m++;
        Set<Long> set = new HashSet<>();
        m--;
        if(n == 2) {
            System.out.println(1);
            return;
        }
        int res = 2;
        set.add(n);
        set.add(n-1);
        long p = n - 1;
        for(long i=2; i<=m; i++) {
            if(i * i == p) {
                set.add(i);
                res += 1;
            } else if (p % i == 0 && i < (p/i)) {
                set.add(i);
                set.add(p/i);
                res += 2;
            }
        }
        for(long i=2; i<=m; i++) {
            long num = n;
            while(num % i == 0) num /= i;
            if(num % i == 1) {
                res++;
                set.add(i);
            }
        }

        System.out.println(set.size());
    }

}