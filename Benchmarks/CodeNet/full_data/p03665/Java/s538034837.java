import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int P = sc.nextInt();
    static int A[] = new int[N];

    public static void main(String[] args) {
        for(int i=0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i < N; i++) {
            if (A[i] % 2 == 0) {
                evenCount ++;
            } else {
                oddCount ++;
            }
        }

        long a = 0;
        for(int i=0; i <= oddCount; i += 2) {
            a += combination(oddCount, i);
        }
        if(oddCount == 0) {
            a = 0;
        }
        long b = (int)Math.pow(2, evenCount);
        long result = b * a;

        System.out.println(result);
    }

    static long combination( int n, int m ) {
        long c = 1;
        m = ( n - m < m ? n - m : m );
        for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
