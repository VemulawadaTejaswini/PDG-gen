import java.util.Scanner;
import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println( solve(X) );
    }

    private static int solve(int X) {
        return upperBound(0, Integer.MAX_VALUE, i -> {
            long n;
            if( i % 2 == 0 ) {
                n = (long)(i + 1) * (i / 2);
            } else {
                n = ((long)(i + 1) * (i / 2)) + ((long)(i + 1) / 2);
            }
            if( n > Integer.MAX_VALUE ) return false;

            return X > n;
        });
    }

    private static int upperBound(int low, int high, IntPredicate more) {
        while(low < high) {
            int mid = low + (high - low) / 2;
            if( more.test(mid) ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}