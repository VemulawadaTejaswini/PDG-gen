import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] As = new int[N];
        int[] Bs = new int[N];

        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
            Bs[i] = sc.nextInt();
        }

        long count = 0;
        for (int i = N - 1; i >= 0; i--) {
            long a = As[i] + count;
            long b = Bs[i];
            if (a % b > 0) {
                count += b - (a % b);
            }
        }

        System.out.println(count);
    }
}