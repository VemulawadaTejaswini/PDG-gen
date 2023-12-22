import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    static int c;
    static int x;

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();
        System.out.println(solve());
    }

    private static int solve() {
        int count = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int sum = i * 500 + j * 100 + k * 50;
                    if (sum == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
