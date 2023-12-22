import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            String s = scanner.next();

            int[] sum = new int[s.length()];
            for(int i = 1; i < s.length(); i++) {
                sum[i] = sum[i - 1];
                if (s.charAt(i - 1) == 'A' && s.charAt(i ) == 'C') {
                    sum[i]++;
                }
            }
            for (int i = 0; i < q; i++) {
                int L = scanner.nextInt();
                int R = scanner.nextInt();
                // ACACTACG
                // 01234567
                // 01122233
                System.out.println(sum[R - 1] - sum[L - 1]);
            }
        }
    }
}
