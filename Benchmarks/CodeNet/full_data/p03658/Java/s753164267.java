import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] barLength = new int[n];
        for (int i = 0; i < n; i++) {
            barLength[i] = sc.nextInt();
        }

        Arrays.sort(barLength);
        int max= 0;
        for (int i = 0; i < k; i++) {
            max += barLength[n - i - 1];
        }
        System.out.println(max);
    }
}