import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[] L = new int[N];
        int max;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(sc.next());
            sum += L[i];
        }
        Arrays.sort(L);

        max = L[L.length - 1];

        if (max < (sum - max)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}