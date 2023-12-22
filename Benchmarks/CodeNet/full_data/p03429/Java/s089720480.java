import java.util.*;

public class Main {
    static char[][] c;
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        c = new char[n][m];
        if(n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }
        if(n % 2 != 0) {
            int v = Math.min(b, m / 2);
            b -= v;
            for (int i = 0; i < v; i++) {
                c[n-1][2* i] = '^';
                c[n-1][2* i + 1] = 'v';
            }
        }
        if(m % 2 != 0) {
            int r = Math.min(a, n / 2);
            a -= r;
            for (int i = 0; i < r; i++) {
                c[2 * i][m- 1] = '<';
                c[2* i + 1][m-1] = '>';
            }
        }