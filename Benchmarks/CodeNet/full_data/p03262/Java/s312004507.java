import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }
        list.add(x);
        Collections.sort(list);
        List<Long> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(list.get(i + 1) - list.get(i) );
        }
        long ans = list2.get(0);
        for (int i = 1; i < n ; i++) {
            ans = gcd(ans, list2.get(i));
        }
        System.out.println(ans);
    }

    public static final long gcd(long a, long b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}