
import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);

        final int w = scan.nextInt();
        final int h = scan.nextInt();
        final int n = scan.nextInt();

        int beginX = 0;
        int endX = w;
        int beginY = 0;
        int endY = h;

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();

            switch (a) {
                case 1:
                    if (beginX < x) {
                        beginX = x;
                    }
                    break;
                case 2:
                    if (endX > x) {
                        endX = x;
                    }
                    break;
                case 3:
                    if (beginY < y) {
                        beginY = y;
                    }
                    break;
                case 4:
                    if (endY > y) {
                        endY = y;
                    }
                    break;
            }
        }

        int ans = (endX - beginX) * (endY - beginY);
        System.out.println(ans > 0 ? ans : 0);

    }
}
