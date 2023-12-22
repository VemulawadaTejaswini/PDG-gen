import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] count;
    public static int[][] root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int q = sc.nextInt();
        root = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                root[i][j] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            root[a - 1][b - 1] = 1;
            root[b - 1][a - 1] = 1;
        }

        count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }
        
        for (int i = 0; i < q; i++) {
            int rootNum = sc.nextInt() - 1;
            int x = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println(count[i]);
            }
            Counter(rootNum, x);
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(count[i]);
            if (i != n - 1) {
                System.out.print(" ");
            } else if (i == n - 1) {
                System.out.println();
            }
        }
    }

    public static void Counter(int rootNum, int x) {
        count[rootNum] += x;
        for (int i = rootNum + 1; i < n; i++) {
            if (root[rootNum][i] == 1) {
                Counter(i, x);
            }
        }
    }
}
