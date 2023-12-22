import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        long ans = scanner.nextLong();
        long K = scanner.nextLong();

        while (true) {
            long tmp = ans - K > 0 ? ans - K : K - ans;
            if (ans > tmp) {
                ans = tmp;
            } else {
                break;
            }
        }

        System.out.print(ans);

        scanner.close();
    }
}