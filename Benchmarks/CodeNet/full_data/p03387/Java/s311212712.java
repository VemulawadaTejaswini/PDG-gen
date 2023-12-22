import java.util.Scanner;

public class Main {

    private static int A, B, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        System.out.println(solve());
    }

    private static int solve() {
        int ans = 0;
        while(diff() >= 2 ) {
            plus2();
            ans++;
        }

        int cm = countMax();
        if( cm == 3 ) {
            return ans; // ok
        } else if( cm == 2 ) {
            return ans + 2; // 4 4 3 みたいなケース
        } else {
            return ans + 1; // 4 3 3 みたいなケース
        }
    }

    private static void show() {
        System.out.println( A + " " + B + " " + C );
    }

    private static int countMax() {
        int max = Math.max(Math.max(A, B), C);
        int cnt = 0;
        if( max == A ) cnt++;
        if( max == B ) cnt++;
        if( max == C ) cnt++;
        return cnt;
    }

    private static int diff() {
        int max = Math.max(Math.max(A, B), C);
        int min = Math.min(Math.min(A, B), C);
        return max - min;
    }

    private static void plus2() {
        int min = Math.min(Math.min(A, B), C);
        if( min == A ) {
            A = A+2;
        } else if( min == B ) {
            B = B+2;
        } else {
            C = C+2;
        }
    }
}
