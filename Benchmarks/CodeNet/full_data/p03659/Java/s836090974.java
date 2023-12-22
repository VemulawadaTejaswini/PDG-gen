import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int n = nextInt();
        List<Integer> a = nextInts(n);
        int size = a.size();

        int result = Integer.MAX_VALUE;
        if (size == 2) {
            result = Math.abs(a.get(0) - a.get(1));
        } else {
            for (int i = 0; i < size - 1; i++) {
                List<Integer> before = a.subList(0, i + 1);
                List<Integer> after = a.subList(i + 1, size);

                int beforeSum = before.parallelStream().mapToInt(bi -> bi).sum();
                int afterSum = after.parallelStream().mapToInt(ai -> ai).sum();
                int absSum = Math.abs(beforeSum - afterSum);

                if (absSum < result) {
                    result = absSum;
                }
            }
        }

        out(result);
    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt() {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString() {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static List<Integer> nextInts(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }

        return list;
    }

    /**
     * 標準出力にオブジェクトを出力します。
     * @param o 出力対象
     */
    public static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        execute();
    }
}