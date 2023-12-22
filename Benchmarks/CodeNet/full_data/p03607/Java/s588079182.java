import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count = 1;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int i = 1; i < N; i++) {
            if (A[i - 1] == A[i]) {
                count++;
            } else {
                if (count % 2 == 1) {
                    ans++;
                }
                count = 1;
            }
        }
        System.out.println(ans);
    }
}
