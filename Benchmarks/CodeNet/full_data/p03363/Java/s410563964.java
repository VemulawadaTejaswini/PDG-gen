import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] data = new long[N];
        for(int i = 0; i < N; i++) {
            data[i] = scan.nextLong();
        }
        long[] sum = new long[N];
        sum[0] = data[0];
        for(int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + data[i];
        }
        Arrays.sort(sum);
        long answer = 0;
        long len = 0;
        for(int i = 0; i < N; i++) {
            if (i == 0) {
                if (sum[0] == 0) {
                    len += 1;
                    answer += len;
                }
                continue;
            }
            if (sum[i] == 0) {
                len += 1;
                answer += len;
                continue;
            }
            if (sum[i] == sum[i-1]) {
                len += 1;
                answer += len;
                continue;
            }
            if (sum[i] != sum[i-1]) {
                len = 0;
            }
        }
        System.out.println(answer);
    }
}
