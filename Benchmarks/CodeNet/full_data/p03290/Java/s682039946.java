import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[] ps = new int[D];
        int[] cs = new int[D];
        int numOfp = 0;
        for (int i = 0; i < D; i++) {
            ps[i] = sc.nextInt();
            numOfp += ps[i];
            cs[i] = sc.nextInt();
        }

        int minCount = Integer.MAX_VALUE;
        for (int i = 1; i < (1 << numOfp); i++) {
            int count = 0;
            int point = 0;
            for (int j = 0; j < numOfp; j++) {
                if ((i & (1 << j)) != 0) {
                    int numOfpp = 0;
                    for (int k = 0; k < D; k++) {
                        numOfpp += ps[k];
                        if (j + 1 <= numOfpp) {
                            point += 100 * (k + 1);
                            break;
                        }
                    }
                    count++;
                }
            }

            int n = 0;
            for (int j = 0; j < D; j++) {
                int prej = (1 << n) - 1;
                n += ps[j];
                if ((i & (((1 << n) - 1) ^ prej)) == (((1 << n) - 1) ^ prej)) {
                    point += cs[j];
                }
            }

            if (point >= G) {
                minCount = Math.min(minCount, count);
            }
        }

        System.out.println(minCount);
    }
}