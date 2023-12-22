import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = solve(A, B, T);

        System.out.println(ans);
    }

    private static int solve(int A, int B, int T) {
        int S = B*(T/A);

        return S;
    }
}