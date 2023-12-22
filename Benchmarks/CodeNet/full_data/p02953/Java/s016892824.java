import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] >= max) {
                max = h[i];
                continue;
            }
            if (max - h[i] > 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
