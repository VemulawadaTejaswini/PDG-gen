import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                boolean allMatched = true;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (Math.abs(x[j] - cx) + Math.abs(y[j] - cy)
                            - Math.abs(x[i] - cx) - Math.abs(y[i] - cy) != h[i] - h[j]) {
                            allMatched = false;
                            break;
                        }
                    }
                    if (!allMatched) {
                        break;
                    }
                }
                if (!allMatched) {
                    continue;
                }
                long hh = h[0] + Math.abs(x[0] - cx) + Math.abs(y[0] - cy);
                StringBuilder sb = new StringBuilder();
                sb.append(cx);
                sb.append(" ");
                sb.append(cy);
                sb.append(" ");
                sb.append(hh);
                System.out.println(sb);
                return;
            }
        }
    }

}
