import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t1 = sc.nextLong();
        long t2 = sc.nextLong();
        long a1 = sc.nextLong();
        long a2 = sc.nextLong();
        long b1 = sc.nextLong();
        long b2 = sc.nextLong();

        if (t1 * a1 + t2 * a2 == t1 * b1 + t2 * b2) {
            System.out.println("infinity");
            return;
        }

        long[] x1 = {t1 * a1, t2 * a2};
        long[] x2 = {t1 * b1, t2 * b2};
        long[] dx = {x2[0] - x1[0], x2[1] - x1[1]};
        long total1 = x1[0];
        long total2 = x2[0];
        int t = 0;

        long count = 0;
        while (true) {
            if (t == 0) t = 1;
            else t = 0;

            if (total1 - total2 > 0 && total1 - total2 > dx[t]) break;
            if (total1 - total2 < 0 && total1 - total2 < dx[t]) break;
            if (total1 - total2 == 0) {
                System.out.println("infinity");
                return;
            }
            count ++;
            total1 += x1[t];
            total2 += x2[t];
        }
        System.out.println(count);
    }
}