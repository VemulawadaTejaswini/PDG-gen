import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        long[] n = new long[3];
        n[0] = scanner.nextInt();
        n[1] = scanner.nextInt();
        n[2] = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int maxIdx = 0;
        if (n[maxIdx] < n[1]) {
            maxIdx = 1;
        }
        if (n[maxIdx] < n[2]) {
            maxIdx = 2;
        }

        // System.out.println(maxIdx);

        long d = (long) Math.pow(2, k);

        long result = 0;

        for (int i = 0; i < 3; i++) {
            result += (i == maxIdx) ? (n[i] * d) : n[i];
        }

        System.out.println(result);

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}