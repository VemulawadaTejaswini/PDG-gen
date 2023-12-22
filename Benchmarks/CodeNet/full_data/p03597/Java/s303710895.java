import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int ans = solve(N, A);

        System.out.println(ans);
    }

    private static int solve(int N, int A) {
        int count = N*N - A;

        return count;
    }

}
