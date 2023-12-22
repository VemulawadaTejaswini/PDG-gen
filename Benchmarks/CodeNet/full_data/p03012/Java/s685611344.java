import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] W = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            sum += W[i];
        }
        sc.close();

        System.out.println(Balance(N, W, 0, 0, sum));
    }
    public static int Balance(int N, int[] W, int index, int f_sum, int B_sum) {
        if (f_sum + W[index] >= B_sum - W[index]) {
            int distA = B_sum - f_sum;
            int distB = (f_sum + W[index]) - (B_sum - W[index]);
            if (distA > distB) {
                return distB;
            }
            return distA;
        }
        return Balance(N, W, index + 1, f_sum + W[index], B_sum - W[index]);
    }
}
