import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        boolean result = true;
        int max = h[0];
        for (int i = 1; i < n && result; i++) {
            if (h[i - 1] - 1 > h[i]) {
                result = false;
            } else if (h[i - 1] > h[i]) {
                h[i - 1]--;
            }
            if (max > h[i - 1]) {
                result = false;
            } else {
                max = h[i - 1];
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}
