import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = solve(A, B);

        System.out.println(ans);
    }

    private static int solve(int A, int B) {
        if (A <= 5) return 0;
        if (A <= 12) return B/2;

        return B;
    }
}
