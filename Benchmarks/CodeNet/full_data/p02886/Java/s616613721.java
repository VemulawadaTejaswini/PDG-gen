import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int ans = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 1 << d.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < d.length; j++) {
                if ((i >> j & 1) == 1) {
                    sb.append(d[j]);
                }
            }
            list.add(sb.toString());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 2) {
                ans = ans + Integer.parseInt(list.get(i).substring(0, 1)) * Integer.parseInt(list.get(i).substring(1, 2));
            }
        }
        // 出力
        System.out.println(Integer.toString(ans));

    }
}
