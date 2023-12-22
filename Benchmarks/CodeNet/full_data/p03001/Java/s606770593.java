
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long total = w * h;

        List<Double> mins = new ArrayList<>();

        // x軸と平行
        double s1 = (h - y) * w;
        mins.add(Math.min(s1, total - s1));

        // y軸と平行
        double s2 = h * (w - x);
        mins.add(Math.min(s2, total - s2));

        // 右上
        double s3 = Math.pow((h - y) + (w - x), 2) / 2;
        mins.add(Math.min(s3, total - s3));
        if (x * h != (h - y) * w) {
            // 左下
            double s6 = Math.pow((y) + (x), 2) / 2;
            mins.add(Math.min(s6, total - s6));
        }

        // 左上
        double s4 = Math.pow((h - y) + (x), 2) / 2;
        mins.add(Math.min(s4, total - s4));

        if (x * h != y * w) {

            // 右下
            double s5 = Math.pow((y) + (w - x), 2) / 2;
            mins.add(Math.min(s5, total - s5));
        }



        double max = Long.MIN_VALUE;

        for (double m : mins) {
            max = Math.max(m, max);
        }

        int count = 0;
        for (double m : mins) {
            if (max == m) count++;
        }

        System.out.println(max);
        System.out.println(count > 1 ? 1 : 0);


    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
