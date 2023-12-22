import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long[] p = new long[a];
        long[] q = new long[b];
        long[] r = new long[c];
        for (int i = 0; i < a; i++) {
            p[i] = sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextLong();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextLong();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list.add(p[a - i - 1]);
        }
        for (int i = 0; i < y; i++) {
            list.add(q[b - i - 1]);
        }
        for (int i = 0; i < c; i++) {
            list.add(r[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        long ans = 0;
        for (int i = 0; i < x + y; i++) {
            ans += list.get(i);
        }
        System.out.println(ans);
    }

}
