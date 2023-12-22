import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            x[i] -= sc.nextInt();
            if (x[i] > 0) sum += x[i];
        }
        System.out.println(sum);
    }
}