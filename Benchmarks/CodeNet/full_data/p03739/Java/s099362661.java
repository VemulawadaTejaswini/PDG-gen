import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int sum1 = 0;
        int sum2 = 0;
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < N; ++i) {
            sum1 += A[i]; 
            if (i % 2 == 0 && sum1 >= 0) {
                ans1 += sum1 +1;
                sum1 = -1;
            } else if (i % 2 != 0 && sum1 <= 0) {
                ans1 += Math.abs(sum1) + 1;
                sum1 = 1;
            }
        }
        for (int i = 0; i < N; ++i) {
            sum2 += A[i]; 
            if (i % 2 == 0 && sum2 <= 0) {
                ans2 += sum1 +1;
                sum2 = 1;
            } else if (i % 2 != 0 && sum2 >= 0) {
                ans2 += Math.abs(sum2) + 1;
                sum2 = -1;
            }
        }
        System.out.println(Math.min(ans1, ans2));
    }
}
