import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ns[] = new long[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.nextLong();
        }
        long sum = ns[0];
        long ans = 0;
        boolean isNegative = ns[0] < 0;
        for (int i = 1; i < n; i++) {
            sum += ns[i];
            if (isNegative && sum < 0) {
                ans -= sum - 1;
                sum = 1;
            }
            else if (!isNegative && sum > 0) {
                ans += sum + 1;
                sum = -1;
            }
            else if (sum == 0) {
                ans++;
            }
            isNegative = !isNegative;
        }

        System.out.println(ans);
    }
}
