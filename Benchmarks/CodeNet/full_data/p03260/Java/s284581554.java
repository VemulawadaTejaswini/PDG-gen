
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long X = scanner.nextInt();
        long[] pos = new long[N];

        for (int i = 0; i < N; i++) {
            pos[i] = scanner.nextLong();
        }
        if (N == 1) {
            System.out.println(Math.max(N, pos[0]) - Math.min(N, pos[0]));
            return;
        }
        long tmpGcd = gcd(dist(X, pos[0]), dist(X, pos[1]));
        for (int i = 2; i < N; i++) {
            tmpGcd = gcd(tmpGcd, dist(X, pos[i]));
        }
        System.out.println(tmpGcd);
    }

    public static long dist(long X, long pos) {
        if (X > pos) {
            return X - pos;
        }
        return pos - X;
    }

    public static long gcd(int x, int y) {
        if( x<y ) {
            int tmp = x; x = y; y = tmp;
        }
        if( (x%y) == 0 ) return y;
        else return gcd(y,x%y);
    }
}