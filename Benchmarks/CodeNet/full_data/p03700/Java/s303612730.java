import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long[] ary = new long[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Long.parseLong(sc.next());
        }
        long l = 0;
        long r = Integer.MAX_VALUE;
        while (l < r - 1) {
            long temp = (l + r) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                long h = ary[i];
                if (h > b * temp) {
                    if ((h - b * temp) % (a - b) == 0) {
                        cnt += (h - b * temp) / (a - b);
                    } else {
                        cnt += (h - b * temp) / (a - b) + 1;
                    }
                }
            }
            if (temp >= cnt) {
                r = temp;
            } else {
                l = temp;
            }
        }
        System.out.println(r);
    }
}