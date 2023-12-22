import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        a.sort(Collections.reverseOrder());
        int base = a.get(0);
        int center = (int) Math.ceil(base / 2.0);

        int num = a.get(a.size() - 1);
        for (int j = 0; j < center; j++) {
            int c1 = center - j;
            if (a.contains(c1)) {
                num = c1;
                break;
            }
            int c2 = center + j;
            if (a.contains(c2)) {
                num = c2;
                break;
            }

        }

        String result = base + " " + num;

        // 出力
        System.out.println(result);
    }
}
