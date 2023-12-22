import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        Arrays.setAll(A, i -> sc.nextInt());
        Arrays.sort(A);
        long up = 0; {
            int i = 0;
            int j = N - 1;
            for(; j - i > 2; i++, j--)
                up += A[j] * 2 - A[i] - A[i + 1];
            if(j - i == 1) {
                up += A[j] - A[0];
            } else {
                up += A[j] - A[i] + A[i + 1] - A[0];
            }
        }
        long down = 0; {
            int i = 0;
            int j = N - 1;
            for(; j - i > 2; i++, j--)
                down += A[j] + A[j - 1] - A[i] * 2;
            if(j - i == 1) {
                down += A[N - 1] - A[i];
            } else {
                down += A[j] - A[i] + A[N - 1] - A[j - 1];
            }
        }
//        System.err.println(up + " " + down);
        System.out.println(Math.max(up, down));
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
