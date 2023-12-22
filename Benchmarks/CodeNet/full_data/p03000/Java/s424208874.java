import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 130<br>
 * B - Bounding<br>
 * <br>
 * https://atcoder.jp/contests/abc130/tasks/abc130_b<br>
 */
public class Main {

    public static void main(String[] args) {

        // 入力
        InputValues value = input(System.in);

        // 計算
        int result = calc(value);

        // 出力
        System.out.println(result);
    }

    private static InputValues input(InputStream in) {
        InputValues inputs = new InputValues();

        try (Scanner sc = new Scanner(System.in)) {
            String[] input1 = sc.nextLine().split(" ");
            String[] input2 = sc.nextLine().split(" ");

            inputs.N = Integer.parseInt(input1[0]);
            inputs.X = Integer.parseInt(input1[1]);

            for (String str : input2) {
                inputs.list.add(Integer.parseInt(str));
            }
        }
        return inputs;
    }

    private static int calc(InputValues inputs) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < inputs.N; i++) {
            ans = ans + inputs.list.get(i);
            if (inputs.X < ans) {
                break;
            }
            count++;
        }
        return count;
    }

    private static class InputValues {
        int N;
        int X;
        List<Integer> list = new ArrayList<Integer>();
    }
}
