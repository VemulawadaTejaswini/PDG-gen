import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + a[i-1];
        }

        int count1 = count(n, true, sum, 0 );
        int count2 = count(n, false, sum, 0);

        System.out.println(Math.min(count1, count2));
    }

    private static int count(int n , boolean pastPlus, int[] sum, long carry){
        int count2 = 0;
        for (int i = 1; i <= n; i++) {
            long cur = sum[i] + carry;

            if (pastPlus && cur > 0) {
                // minus nisinaito
                count2 += cur + 1;
                carry = - cur - 1;
            }
            if (!pastPlus && cur < 0) {
                count2 += -cur + 1;
                carry = -cur + 1;
            }

            pastPlus = !pastPlus;
        }

        return count2;
    }
}