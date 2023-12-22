import java.util.*;

public class Main {

    public long[] solve(int N) {
        double x, y, z;
        boolean found = false;
        long[] ret = new long[3];
        for (int i = 1; i <= 3500; i++) {
            for (int j = 1; j <= 3500; j++) {
                x = N * i + N * j - (4 * i * j);
                y = - (N * i * j);
                if ((y % x) == 0) {
                    return new long[]{ i, j, (long)(y/x) };
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