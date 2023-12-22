import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        int prev = h[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (h[i] <= prev) {
                // do nothing
                prev = h[i];
            } else if (h[i] == prev + 1) {
//                prev = prev;
            } else {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }

}
