import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = in.nextInt() - 1;
            }
            int[] a = new int[N];
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = 40000 * i;
                b[N - 1 - i] = 40000 * i;
            }
            for (int i = 0; i < N; i++) {
                a[p[i]] += i;
            }

//            int[] sum = new int[N];
//            for (int i = 0; i < N; i++) {
//                sum[i] = a[i] + b[i];
//            }
//            for (int i = 0; i < N; i++) {
//                if (i - 1 >= 0 && a[i - 1] >= a[i]) {
//                    Utils.debug("a[i - 1] >= a[i]");
//                }
//                if (i - 1 >= 0 && b[i - 1] <= b[i]) {
//                    Utils.debug("b[i - 1] <= b[i]");
//                }
//                if (i - 1 >= 0 && sum[p[i - 1]] >= sum[p[i]]) {
//                    Utils.debug("sum[p[i - 1]] >= sum[p[i]]");
//                }
//            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(a[i] + 1);
            }
            sb.append("\n");
            for (int i = 0; i < N; i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(b[i] + 1);
            }
            System.out.println(sb.toString());
        }
    }
}
