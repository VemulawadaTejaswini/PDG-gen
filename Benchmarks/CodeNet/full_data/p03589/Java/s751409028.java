import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean blnFound = false;
        for ( long h = 1; h < 3501; h++ ) {
            for ( long n = 1; n < 3501; n++ ) {
                long p = h * n;
                long s = h + n;
                long a = N * p;
                long b = 4 * p - N * s;
                if ( b <= 0 ) continue;
                long r = a % b;
                if ( r != 0 ) continue;
                blnFound = true;
                long w = a / b;
                System.out.println(String.format("%s %s %s", h, n, w));
                break;
            }
            if ( blnFound ) break;
        }
    }
}