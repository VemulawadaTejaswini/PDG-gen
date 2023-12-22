import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        Arrays.setAll(A, i -> sc.nextInt());
        final int[] B = new int[N];
        Arrays.setAll(B, i -> sc.nextInt());
        for (int i = 0; i < N; i++)
            A[i] -= B[i];
        Arrays.sort(A);
        long minus = 0;
        int ans = 0;
        for (int i = 0; i < N && A[i] < 0; i++, ans++)
            minus += A[i];
        for (int i = N - 1; i >= 0 && A[i] > 0 && minus < 0; i--, ans++)
            minus += A[i];
        System.out.println(minus < 0 ? -1 : ans);
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
