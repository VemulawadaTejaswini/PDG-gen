import java.util.*;

public class Main {

    public long[] solve(int N) {
        double x, y, z;
        boolean found = false;
        long[] ret = new long[3];
        for (double i = 1; i <= 3500; i++) {
            for (double j = 1; j <= 3500; j++) {
                x = 4 * i * j - N * i - N * j;
                y = N * i * j;
                z = y / x;
                if ((y % x) == 0 && z > 0) {
                    return new long[]{ (long)i, (long)j, (long)x };
                }
            }
        }
        return new long[]{0,0,0};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main obj  = new Main();
        long[] ret = obj.solve(n);
        System.out.println(ret[0]+" "+ret[1]+" "+ret[2]);
    }
}