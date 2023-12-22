import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] d = new int[n];
        int[] r = new int[n];
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            if (d[i] < min) {
                min = d[i];
                index = i;
            }
        }

        for (int i = 0; i <= d[index] * 2; i += 2) {
            if (i == 2 && d[index] % 2 == 0) {
                continue;
            }
            r[(index + 1) % n] = i;
            for (int j = 1; j < n; j++) {
                r[(index + j + 1) % n] = (d[(index + j) % n] - (r[(index + j) % n] / 2)) * 2;
            }
            if ((r[(index) % n] / 2) + (r[(index + 1) % n] / 2) == d[index]) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(r[j]);
                    sb.append(" ");
                }
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
                System.exit(0);
            }
        }
    }
}

