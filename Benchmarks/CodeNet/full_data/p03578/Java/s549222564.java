import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(sc.next());
            list.add(d);
        }

        int m = Integer.parseInt(sc.next());
        boolean judge = true;
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(sc.next());
            int index = list.indexOf(t);
            if (index < 0) {
                judge = false;
                break;
            } else {
                list.remove(index);
            }
        }
        sc.close();

        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
