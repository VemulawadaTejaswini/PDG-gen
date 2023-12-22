import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int tt = 0;
            int xx = 0;
            int yy = 0;

            for (int i = 0; i < N; i++) {
                int t = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();

                int d = Math.abs(x - xx) + Math.abs(y - yy);
                if ((d > t - tt) || (d % 2 != (t - tt) % 2)) {
                    System.out.println("No");
                    System.exit(0);
                }
            }

            System.out.println("Yes");
        }
    }

}