import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] d = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println("Yes");
            return;
        }
        h[0] -= 1;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (h[i] - h[i + 1] >= 1) {
                System.out.println("No");
                return;
            }
            if (h[i] < h[i + 1]) {
                h[i + 1] -= 1;
            }
        }

        System.out.println("Yes");

    }

}