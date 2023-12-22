import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String[] aStrings = sc.nextLine().split(" ");
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(aStrings[i]);
        }

        int count = 0;
        int pre = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre >= as[i]) {
                count++;
            }
            pre = as[i];
        }
        System.out.println(count);
    }
}