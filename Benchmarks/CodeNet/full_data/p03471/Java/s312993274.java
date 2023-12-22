import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        int a = -1;
        int b = -1;
        int c = -1;

        for (x = 0; x <= N; x++) {
            for (y = 0; y <= N - x; y++) {
                if (10000 * x + 5000 * y + 1000 * (N - x - y) == Y) {
                    a = x;
                    b = y;
                    c = N - x - y;
                }
            }
        }

        System.out.println(a + " " + b + " " + c);
    }
}