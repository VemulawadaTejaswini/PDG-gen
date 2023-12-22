import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int ans = solve(H, W, N);

        System.out.println(ans);
    }

    private static int solve(int H, int W, int N) {
        int longer = Math.max(H, W);
        int count = N/longer;

        if (N%longer != 0) {
            count++;
        }

        return count;
    }

}
