import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int t1 = 0;
        int x1 = 0;
        int y1 = 0;
        int t2 = 0;
        int x2 = 0;
        int y2 = 0;
        double dt = 0;

        for (int i = 0; i < N; i++) {
            t1 = Integer.parseInt(sc.next());
            x1 = Integer.parseInt(sc.next());
            y1 = Integer.parseInt(sc.next());

            dt = Math.abs(x2 - x1) + Math.abs(y2 - y1);
            if ( dt > t1 || ((t2-t1) - dt) % 2 != 0) {
                System.out.println("No");
                System.exit(0);
            }

            x2 = x1;
            y2 = y1;
            t2 = t1;
        }

        System.out.println("Yes");
    }
}
