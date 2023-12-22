import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] data = new long[N];
        for(int i = 0; i < N; i++) {
            data[i] = scan.nextLong();
        }
        long[] sum = new long[N+1];
        sum[0] = 0;
        for(int i = 1; i <= N; i++) {
            sum[i] = sum[i-1] + data[i-1];
        }
        long answer = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = i; j <= N; j++) {
                if (sum[j] - sum[i - 1] == 0) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
