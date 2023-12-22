import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] as = new int[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextInt();
        }
        System.out.println( solve(N, as) );
    }

    private static int solve(int N, int[] as) {
        int min = Integer.MAX_VALUE;

        for (int n = -100; n <= 100; n++) {
            min = Math.min( calc(n, as), min );
        }
        return min;
    }

    private static int calc(int n, int[] as) {
        int cost = 0;
        for (int a : as) {
            int diff = a - n;
            cost += diff * diff;
        }
        return cost;
    }
}