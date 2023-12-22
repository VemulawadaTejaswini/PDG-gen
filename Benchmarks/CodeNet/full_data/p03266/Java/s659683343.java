import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long t = n / k;
        long ans = t * t * t;

        if (k % 2 == 0) {
            long temp = n / (k / 2) - t;
            ans += temp * temp* temp;
        }

        System.out.println(ans);
    }
}
