import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[] L = new int[N];
        int max;
        int tmp = 0;

        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(L);

        max = L[L.length - 1];
        for (int i = 0; i < N-1; i++) {
           tmp += L[i];
        }

        if (max < tmp) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}