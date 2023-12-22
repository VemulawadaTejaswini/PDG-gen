import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        long ans = 0;
        if (n == 1) ans = 0;
        else {
            for (long i = 1; i < n; i++) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}