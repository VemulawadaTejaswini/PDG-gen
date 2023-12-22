import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(solve(n, h));
    }

    public static String solve(int n, int[] h) {
        int max = h[0];
        for (int i = 1; i < n; i++) {
            int current = h[i];
            if (current <= max - 2) {
                return "No";
            }

            max = Math.max(current, max);
        }
        return "Yes";
    }
}


