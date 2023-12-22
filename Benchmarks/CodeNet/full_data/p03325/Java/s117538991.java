import java.util.Scanner;

public class Main {

    static int N;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        solve();
    }

    static void solve() {
        long sum = 0;
        for (int ai : a) {

            int temp = 0;
            while (true) {
                if (ai % 2 == 0) {
                    temp++;
                    ai /= 2;
                } else {
                    break;
                }
            }
            sum += temp;
        }

        System.out.println(sum);
    }
}
