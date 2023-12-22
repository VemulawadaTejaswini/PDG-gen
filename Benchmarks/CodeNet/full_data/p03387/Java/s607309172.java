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
        int sum = A + B + C;
        int max = Math.max(Math.max(A, B), C);

        int diff = max * 3 - sum;
        if ( diff % 2 == 0 ) {
            return diff / 2;
        } else {
            return diff / 2 + 2;
        }
    }
}
