

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i = 0; i < x; i++) a[i] = sc.nextLong();
        for (int i = 0; i < y; i++) b[i] = sc.nextLong();
        for (int i = 0; i < z; i++) c[i] = sc.nextLong();
        List<Long> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + b[j]);
            }
        }
        ab.sort(Comparator.reverseOrder());

        List<Long> abc = new ArrayList<>();

        for (int i = 0; i < Math.min(ab.size(), k); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c[j]);
            }
        }
        abc.sort(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
