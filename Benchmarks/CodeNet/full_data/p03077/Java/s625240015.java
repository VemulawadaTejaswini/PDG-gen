import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a[] = new long[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLong();
        }
        sc.close();
        Arrays.sort(a);
        long sho = n / a[0];
        long ans = 0;
        if (sho == 0) {
            ans = 5;
        } else {
            long ama = n % a[0];
            if (ama == 0) {
                ans = sho + 4;
            } else {
                ans = sho + 5;
            }

        }
        System.out.println(ans);

    }
}