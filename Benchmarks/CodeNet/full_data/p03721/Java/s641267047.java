import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();

        for (int i = 0; i < n; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            k -= b;
            if (k <= 0) {
                System.out.println(a);
                break;
            }
        }
    }

}