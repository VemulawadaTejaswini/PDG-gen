import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0;
        if (n == 1) {
            if (m == 1) {
                ans = 1;
            } else if (m == 2) {
                ans = 0;
            } else {
                ans = m - 2;
            }
        } else if (n == 2) {
            ans = 0;
        } else {
            if (m == 1) {
                ans = n - 2;
            } else if (m == 2) {
                ans = 0;
            } else {
                ans = (n - 2) * (m - 2);
            }
        }
        System.out.println(ans);
    }
}