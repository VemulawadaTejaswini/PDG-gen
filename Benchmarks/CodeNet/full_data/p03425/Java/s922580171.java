import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        Arrays.setAll(s, i -> sc.next());
        sc.close();

        // 主処理
        List<String> mList = new ArrayList<>();
        List<String> aList = new ArrayList<>();
        List<String> rList = new ArrayList<>();
        List<String> cList = new ArrayList<>();
        List<String> hList = new ArrayList<>();
        for (String name : s) {
            if (name.startsWith("M")) {
                mList.add(name);
            } else if (name.startsWith("A")) {
                aList.add(name);
            } else if (name.startsWith("R")) {
                rList.add(name);
            } else if (name.startsWith("C")) {
                cList.add(name);
            } else if (name.startsWith("H")) {
                hList.add(name);
            }
        }

        int sum = Math.min(1, mList.size()) + Math.min(1, aList.size()) + Math.min(1, rList.size())
                + Math.min(1, cList.size()) + Math.min(1, hList.size());

        long result = 0;
        long m = combination(sum - mList.size(), 3);
        long a = combination(sum - aList.size(), 3);
        long r = combination(sum - rList.size(), 3);
        long c = combination(sum - cList.size(), 3);
        long h = combination(sum - hList.size(), 3);
        result = m + a + r + c + h;

        // 出力
        System.out.println(result);
    }

    public static long combination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
