import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans;
        if (k % 2 == 0) {
            long a = n / k;
            long b = n / (k / 2);
            long c = b - a;
            ans = c * c * c + a * a * a;
        } else {
            long a = n / k;
            ans = a * a * a;
        }
        System.out.println(ans);
    }
}