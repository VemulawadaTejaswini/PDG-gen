import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int n = nextInt();
        Map<Integer, Integer> axMap = new HashMap<>();

        for (int i = 0 ;i < n; i++) {
            int ax = nextInt();

            if (axMap.containsKey(ax)) {
                axMap.put(ax, axMap.get(ax) + 1);
            } else {
                axMap.put(ax, 1);
            }
        }

        // キーの降順ソート
        Integer[] mapkey = axMap.keySet().toArray(new Integer[axMap.size()]);
        Arrays.sort(mapkey, Comparator.reverseOrder());

        int max = 0;
        int second = 0;
        for (Integer key : mapkey) {
            Integer value = axMap.get(key);

            if (value <= 1) {
                continue;
            }

            if (key > max) {
                max = key;
            } else if (key > second) {
                second = key;
            }

            if (max > 0 && second > 0) {
                break;
            }
        }

        out(max * second);
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
    public static int[] nextInts(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        return arr;
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