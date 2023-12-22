import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int m = -1, f = -1, t = -1;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (i + j <= N) {
                    int k = N - i - j;
                    if (i + j + k == N) {
                        if (10000 * i + 5000 * j + 1000 * k == Y) {
                            m = i;
                            f = j;
                            t = k;
                        }
                    }
                }

            }
        }
        System.out.println(m + " " + f + " " + t);

        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < N; i++) {
        // list.add(sc.nextInt());
        // }
    }
}