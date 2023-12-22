import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        Deque<String> dq = new ArrayDeque<>();
        while (4 < n) {
            int half = (int) Math.ceil(n / 2.0);
            n -= half;
            dq.addFirst(Integer.toString(half));
        }
        if (n == 4) {
            dq.addFirst("3");
            dq.addFirst("1");
        } else {
            dq.addFirst(Integer.toString(n));
        }

        String result = String.join("\r\n", dq);

        // 出力
        System.out.println(result);
    }
}
