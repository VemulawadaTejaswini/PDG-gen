import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        int carry = 0;
        for (int i = 0; i < n; i++) {
            long ai = a[i];
            sum += (ai + carry) / 2;
            carry = 0;
            if (ai % 2 != 0 && i < n - 1) {
                carry = 1;
            }
        }
        System.out.println(sum);
    }

}
