import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] sumh = new int[w];
        int[] sumh2 = new int[w];

        int[][] ans = new int[h][w];
        for (int j = 0; j < a; j++) {
            ans[0][j] = 1;
            sumh[j]++;
        }
        for (int j = a; j < w; j++) {
            sumh2[j]++;
        }

        boolean next = false;
        // 縦と横で数える0 or 1 が同じ場合
        for (int i = 1; i < h; i++) {
            int sumw = 0;
            for (int j = 0; j < w; j++) {
                if (sumh[j] < b) {
                    ans[i][j] = 1;
                    sumh[j]++;
                    sumw++;
                }
                if (sumw >= a) {
                    break;
                }
            }
            if (sumw < a) {
                // System.out.println("No");
                // System.exit(0);
                next = true;
                break;
            }
        }

        if (!next) {
            for (int j = 0; j < w; j++) {
                if (sumh[j] < b) {
                    // System.out.println("No");
                    // System.exit(0);
                    next = true;
                }
            }
        }

        if (!next) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            System.exit(0);
        }

        // 縦と横で数える0 or 1 が異なる場合
        for (int i = 1; i < h; i++) {
            int sumw = 0;
            int sumw2 = 0;
            for (int j = w - 1; j >= 0; j--) {
                if (sumh2[j] < b && sumw2 <= w / 2) {
                    sumh2[j]++;
                    sumw2++;
                } else {
                    ans[i][j] = 1;
                    sumw++;
                }
                if (sumw >= a) {
                    break;
                }
            }
            if (sumw < a) {
                System.out.println("No");
                System.exit(0);
                // break;
            }
        }

        for (int j = 0; j < w; j++) {
            if (sumh2[j] < b) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

}
