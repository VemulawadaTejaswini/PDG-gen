import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        long[] count = new long[100000];
        int max = 0;
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
            max = Math.max(max, d[i]);
        }

        for (int i = 0; i < n; i++) {
            count[d[i]]++;
        }
        if (count[0] != 1) {
            System.out.println(0);
            return;
        }
        long sum = 1;
        for (int i = 1; i <= max; i++) {
            if (count[i - 1] == 0 && i != max - 1) {
                System.out.println(0);
                return;
            }
            for (long j = 0; j < count[i + 1]; j++) {
                sum %= 998244353;
                sum *= count[i] % 998244353;
            }
        }
        System.out.println(sum % 998244353);
    }

}
