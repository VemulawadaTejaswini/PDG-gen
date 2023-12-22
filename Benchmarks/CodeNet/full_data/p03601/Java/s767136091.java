import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int water_a = nextInt(); // A操作 100 * a
        int water_b = nextInt(); // B操作 100 * b
        int into_c = nextInt();     // C操作 Cグラム入れる
        int into_d = nextInt();       // Dグラム入れる
        int melt_g = nextInt();         // 100gあたりEグラムとける
        int max = nextInt();            // Fグラムまで

        // 100a, 100bの計算
        int aGram = water_a * 100;
        int bGram = water_b * 100;

        int abMin = Math.min(aGram, bGram);
        int cdMin = Math.min(into_c, into_d);

        // 砂糖質量と砂糖水質量
        int sugarWaterMass = 0;

        // 大きい方をいっぱい入れる計算
        int abMeltG = melt_g * (abMin / 100);
        abMeltG = Math.min(abMeltG, max - abMin);

        int sugarAdd = into_c + into_d;
        int sugarMass = sugarAdd * (abMeltG / sugarAdd) + cdMin;

        sugarWaterMass = sugarMass + abMin;

        out(sugarWaterMass + " " + sugarMass);
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