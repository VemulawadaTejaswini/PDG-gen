import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int max = Math.min(a + k - 1, b);
        List<Integer> list = new ArrayList<>();
        for (int i = a; i <= max; i++) {
            list.add(i);
        }
        int min = Math.max(a, b - k + 1);
        for (int i = b; min <= i; i--) {
            list.add(i);
        }
        list = new ArrayList<>(new HashSet<>(list));
        Collections.sort(list);

        // 出力
        for (int num : list) {
            System.out.println(num);
        }
    }
}
