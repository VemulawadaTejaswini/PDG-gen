import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] k = new Integer[m];
        List<Integer[]> sList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            k[i] = Integer.parseInt(sc.next());
            Integer[] s = new Integer[k[i]];
            for (int j = 0; j < k[i]; j++) {
                s[j] = Integer.parseInt(sc.next()) - 1;
            }
            sList.add(s);
        }
        Integer[] p = new Integer[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        List<List<Integer>> combinationList = combinationList(n);
        int result = 0;

        for (List<Integer> list : combinationList) {
            boolean isAllOn = true;
            for (int i = 0; i < m; i++) {
                int onCount = 0;
                for (int j = 0; j < k[i]; j++) {
                    if (list.contains(sList.get(i)[j])) {
                        onCount++;
                    }
                }
                if (onCount % 2 != p[i]) {
                    isAllOn = false;
                    break;
                }
            }
            if (isAllOn) {
                result++;
            } else {
                continue;
            }
        }

        // 出力
        System.out.println(result);
    }

    public static List<List<Integer>> combinationList(int n) {
        List<List<Integer>> combinationList = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    list.add(j);
                }
            }
            combinationList.add(list);
        }
        return combinationList;
    }
}
