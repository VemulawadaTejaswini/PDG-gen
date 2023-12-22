import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        int _10000 = -1;
        int _5000 = -1;
        int _1000 = -1;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;
                if (i + j + k == N && 10000 * i + 5000 * j + 1000 * k == Y) {
                    _10000 = i;
                    _5000 = j;
                    _1000 = k;
                    System.out.printf("%d %d %d\n", _10000, _5000, _1000);
                    sc.close();
                    return;
                }
            }
        }

        System.out.printf("%d %d %d\n", _10000, _5000, _1000);
        sc.close();
    }
}