import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] xA = new int[n];
        int[] yA = new int[m];

        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            yA[i] = sc.nextInt();
        }

        Arrays.sort(xA);
        Arrays.sort(yA);

        if (xA[n - 1] <= yA[0]) {
            if (x < xA[n - 1] && y >= yA[0]) {
                System.out.println("No War");
                System.exit(0);
            }
        }
        System.out.println("War");
    }
}
