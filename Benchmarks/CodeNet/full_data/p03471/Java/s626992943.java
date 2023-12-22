import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        boolean isContinue = true;

        for (x = 0; x <= N; x++) {
            if (10000 * x > Y) {
                break;
            }
            for (y = 0; y <= N - x; y++) {
                if (10000 * x + 5000 * y > Y) {
                    break;
                }
                for (z = 0; z <= N - x - y; z++) {
                    if (10000 * x + 5000 * y + 1000 * z == Y) {
                        isContinue = false;
                        break;
                    }
                }
                if (!isContinue) {
                    break;
                }
            }
            if (!isContinue) {
                break;
            }
        }

        if (isContinue) {
            x = y = z = -1;
        }

        System.out.println(x + " " + y + " " + z);
    }
}
