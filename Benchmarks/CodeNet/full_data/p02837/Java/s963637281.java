import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static long ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<List<int[]>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            List<int[]> list2 = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                int[] aa = new int[2];
                int x = Integer.parseInt(sc.next()) - 1;
                int y = Integer.parseInt(sc.next());
                aa[0] = x;
                aa[1] = y;
                list2.add(aa);
            }
            list.add(list2);
        }
        int ans = 0;
        f:
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ((i & (1 << j)) == 0) {
                    continue;
                }
                List<int[]> tmpAry = list.get(j);
                for (int k = 0; k < tmpAry.size(); k++) {
                    int[] tmp = tmpAry.get(k);
                    int num = tmp[0];
                    int bit = tmp[1];
                    if ((i >> num & 1) != bit) {
                        continue f;
                    }
                }
            }
            ans = Math.max(ans, Integer.bitCount(i));
        }
        System.out.println(ans);
    }
}