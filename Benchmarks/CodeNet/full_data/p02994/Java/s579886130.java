import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int min = L;
        int prevTaste = L;
        int sum = L;

        for (int i = 1; i < N; i++) {
            int taste = L + (i + 1) - 1;
            sum += taste;
            if (Math.abs(taste) < Math.abs(prevTaste)) {
                min = taste;
            }
            prevTaste = taste;
        }

        System.out.print(sum - min);

    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
