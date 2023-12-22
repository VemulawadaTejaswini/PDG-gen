import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        int maxMove = 0;
        int move = 0;
        for (int i = 0; i < n - 1; i++) {
            if (h[i] >= h[i + 1]) {
                move++;
                maxMove = Math.max(maxMove, move);
                continue;
            }
            move = 0;
        }
        System.out.println(maxMove);
    }

}
