import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (10000 * i + 5000 * j + 1000 * (n - i - j) == y) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}