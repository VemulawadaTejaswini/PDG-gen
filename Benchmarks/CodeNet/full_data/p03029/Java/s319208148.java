import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();
        int ans = solve(A, P);

        System.out.println(ans);
    }

    private static int solve(int A, int P) {
        int sum = A*3 + P;

        return sum/2;
    }
}
