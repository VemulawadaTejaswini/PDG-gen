import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        int n = nextInt(sc);
        int k = nextInt(sc);
        Map<Integer, Integer> countMap = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            int ai = nextInt(sc);

            putCountMap(countMap, ai);
        }

        // value降順ソート
        List<Entry<Integer, Integer>> countEntry = new ArrayList<Entry<Integer, Integer>>(countMap.entrySet());
        valueReverseSort(countEntry);

        // 最低種類数と実際の種類数の差を計算、この差の分だけ、最も数が少ないものから入れ替える
        int requireChangeValue = countMap.size() - k;
        int result = 0;

        if (requireChangeValue > 0) {
            for (int i = countEntry.size() - 1; i >= countEntry.size() - requireChangeValue; i--) {
                result += countEntry.get(i).getValue();
            }
        }

        out(result);

    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt(Scanner sc) {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString(Scanner sc) {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static int[] nextInts(Scanner sc, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt(sc);
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

    public static void putCountMap(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        } else {
            map.put(value, 1);
        }
    }

    private static void valueReverseSort(List<Entry<Integer, Integer>> highEntry) {
        Collections.sort(highEntry, new Comparator<Entry<Integer, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
    }
}