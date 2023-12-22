import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[][] x = new int[n][];
        int[][] y = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            x[i] = new int[a[i]];
            y[i] = new int[a[i]];
            for (int j = 0; j < a[i]; j++) {
                x[i][j] = sc.nextInt();
                y[i][j] = sc.nextInt();
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            max *= 2;
        }
        int ans = 0;
        for (int i = 0; i < max; i++) {
            boolean isOk = true;
            int counter = 0;
            for (int j = 0; j < n; j++) {
                int isRight = (i >> j) % 2;
                // System.out.print(isRight);
                if (isRight == 1) {
                    for (int k = 0; k < a[j]; k++) {
                        if (y[j][k] == 1) {
                            // System.out.println("judge:" + (i >> (x[j][k] - 1)) % 2);
                            if ((i >> (x[j][k] - 1)) % 2 != 1) {
                                // NG
                                isOk = false;
                            } else {
                                counter++;
                            }
                        } else {
                            if ((i >> (x[j][k] - 1)) % 2 != 0) {
                                // NG
                                isOk = false;
                                // } else {
                                // counter++;
                            }
                        }
                    }
                }
            }
            // if (isOk && counter > ans) {
            // ans = counter;
            // // System.out.println("counter:" + counter);
            // }
            if (isOk) {
                int newCounter = 0;
                for (int j = 0; j < n; j++) {
                    int isRight = (i >> j) % 2;
                    if (isRight == 1) {
                        newCounter++;
                    }
                }
                if (newCounter > ans) {
                    ans = newCounter;
                }
            }
            // System.out.println();
        }
        System.out.println(ans);

        sc.close();
    }

}
