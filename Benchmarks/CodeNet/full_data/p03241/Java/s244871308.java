import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 1;
        for (int i = m; i > 0; i--) {
            if (m % i == 0 && m / i >= n) {
                max = i;
                break;
            }
        }

        System.out.println(max);
    }
}