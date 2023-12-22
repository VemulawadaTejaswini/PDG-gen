port java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = solve2(a, b);
        System.out.println(ans);
    }

    private static int solve(int a, int b) {
        int d = b - a;
        int sum = 0;

        for (int i=1; i<d; i++) {
            sum += i;
        }

        return sum - a;
    }

    private static int solve2(int a, int b) {
        int d = b-a;

        return d*(d-1)/2;
    }
}
