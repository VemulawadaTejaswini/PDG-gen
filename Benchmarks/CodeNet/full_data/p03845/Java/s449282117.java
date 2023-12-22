
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }

        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int p = in.nextInt();
            int x = in.nextInt();

            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j + 1 == p) {
                    sum += x;
                } else {
                    sum += t[j];
                }
            }
            System.out.println(sum);
        }
    }

}
