
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();

        }

        Arrays.sort(a);
        if (a.length == 2) {
            System.out.println(Math.max(a[0], a[1]));
            return;
        }

        //a0カエルケース
        int gcd1 = gcd(a[1], a[2]);
        for (int i = 1 ; i < n ; i++) {
            gcd1 = gcd(gcd1, a[i]);
        }

        //a0変えないケース、a0の約数を求めたいお気持ち
        Set<Integer> set = new HashSet<>();
        double flor = Math.floor(Math.sqrt(a[0]));
        for (int i = 1 ; i <=  flor ; i++) {
            if (a[0] % i == 0) {
                set.add(i);
                set.add(a[0] / i);
            }
        }


        int max = 1;

        for (Integer i : set) {
            int count = 0;
            for (int j = 1 ; j < n ; j++) {
                if (a[j] % i != 0) {
                    count++;
                }

            }
            if (count <= 1) {
                max = Math.max(max, i);
            }
        }

        System.out.println(Math.max(gcd1, max));
    }

    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}