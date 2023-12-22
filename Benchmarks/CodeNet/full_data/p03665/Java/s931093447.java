import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scan.nextInt() % 2 == 1) count++;
        }
        long sum = 0;
        if (p == 0) sum++;
        for (int i = 0; i <= count; i++) {
            if (p == 1) {
                if (i % 2 == 1) {
                    sum += combination(count, i);
                }
            } else {
                if (i % 2 == 0) {
                    sum += combination(count, i);
                }
            }
        }
        System.out.println((long)(sum * Math.pow(2, n - count)));
    }
    
    long combination(int n,int m) {
        long c = 1;
        m = ( n - m < m ? n - m : m );
        for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
    public static void main(String[] args) {
//        System.out.println(new Main().combination(5, 3));
        new Main().run();
    }
}
