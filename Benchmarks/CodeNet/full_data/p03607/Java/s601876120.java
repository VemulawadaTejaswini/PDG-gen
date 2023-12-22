import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    /**
     * joisinoお姉ちゃん達が使ってる紙です
     *
     * @author parikkus
     *
     */
    public static class Paper {
        List<Integer> writeNumber = new ArrayList<>();

        public void joisinoCall(Integer num) {
            if (writeNumber.contains(num)) {
                writeNumber.remove(num);
            } else {
                writeNumber.add(num);
            }
        }

        public int numberCount() {
            return writeNumber.size();
        }
    }

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int n = nextInt();
        Paper p = new Paper();

        for (int i = 0; i < n; i++) {
            p.joisinoCall(nextInt());
        }

        out(p.numberCount());
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