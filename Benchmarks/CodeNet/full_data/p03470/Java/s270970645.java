import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] d = new Integer[n];
        Arrays.setAll(d, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Set<Integer> set = new HashSet<>(Arrays.asList(d));
        int result = set.size();

        // 出力
        System.out.println(result);
    }
}
