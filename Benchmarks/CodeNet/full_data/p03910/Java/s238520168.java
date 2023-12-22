import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int sum = 0;
        List<String> list = new ArrayList<>();
        for (int i = 1; sum < n; i++) {
            sum += i;
            list.add(Integer.toString(i));
        }
        int diff = sum - n;
        if (0 < diff) {
            list.remove(list.indexOf(Integer.toString(diff)));
        }

        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
