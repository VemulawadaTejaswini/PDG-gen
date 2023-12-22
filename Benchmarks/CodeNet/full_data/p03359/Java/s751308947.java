import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        ArrayList<String> calcs = calc(n);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(calcs.get(i));
        }

        System.out.println(String.join(" ", result));

        // System.out.println(System.currentTimeMillis() - startTime);
    }

    public static ArrayList<String> calc(int count) {

        ArrayList<String> result = new ArrayList<>();

        int ptr = 0; // 得られた素数の数
        int[] prime = new int[55555]; // 素数を格納する配列

        prime[ptr++] = 2; // 素数2を登録
        prime[ptr++] = 3; // 素数3を登録

        int counter = 2;
        for (int n = 5; n <= 55555; n += 2) { // 対象は奇数のみ
            boolean wflag = false; // 割り切れたかどうか
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                // 対象の数の平方根以下の全ての素数で除算する
                if (0 == n % prime[i]) { // 割り切れたら素数ではない
                    wflag = true;
                    break;
                }
            }
            if (!wflag) { // 最後まで割り切れなかったら
                prime[ptr++] = n; // 素数として新たに登録
                counter++;
                if ((counter % 2) != 0) {
                    result.add(String.valueOf(n));
                }
            }
        }
        return result;
    }
}