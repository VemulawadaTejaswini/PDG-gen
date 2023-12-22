public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        boolean[][] f = new boolean[n][10];
        int[][] p = new int[n][11];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 10; j++)
                f[i][j] = scanner.nextInt() == 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 11; j++)
                p[i][j] = scanner.nextInt();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < 1024; i++) {
            int count1 = 0;
            for (int j = 0; j < n; j++) {
                int count2 = 0;
                for (int k = 0; k < 10; k++)
                    if ((i >> k & 1) == 1 && f[j][k])
                        count2++;
                count1 += p[j][count2];
            }
            ans = Math.max(ans, count1);
        }
        System.out.println(ans);
    }
}