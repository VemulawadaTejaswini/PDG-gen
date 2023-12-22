import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] H = new int[N]; //参照先がオーバーすることがあるので1余計に取る
        for (int i = 0; i < N; i++) H[i] = cin.nextInt();

        int pos = 0;
        int cost = 0;
        while (pos < N - 1) {
            // 2つ進めるなら2つ進む
            if (pos + 2 <= N - 1) {
                cost += Math.abs(H[pos + 2] - H[pos]);
                pos += 2;
            }
            // 1つしか進めないなら1つ進む
            else {
                cost += Math.abs(H[pos + 1] - H[pos]);
                pos += 1;
            }
        }
        System.out.println(cost);
    }
}

