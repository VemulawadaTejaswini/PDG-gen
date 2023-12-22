import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int N, X;
        Scanner scanner = new Scanner(in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        int[] distances = new int[N+1];
        distances[0] = X;
        for(int i = 1; i <= N; ++i) {
            distances[i] = scanner.nextInt();
        }
        Arrays.sort(distances);
        int ans = distances[1]-distances[0];
        for(int i = 1; i < N; ++i) {
            ans = GCD(ans, distances[i]-distances[i-1]);
        }
        System.out.println(ans);
    }

    private static int GCD(int a, int b) {
       if (b==0) return a;
       return GCD(b,a%b);
    }
}