import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (h[i + 1] < h[i]) {
                System.out.println("No");
                return;
            }

            if (h[i + 1] > h[i]) {
                h[i + 1]--;
            }
        }

        System.out.println("Yes");
    }
}