import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        System.out.println(solvePriorityQueue(K));
    }

    private static String solve(int K) {
        if (K <= 9) {
            return String.valueOf(K);
        }

        int total = 9;
        List<String>[] ans = new ArrayList[11];
        List<String>[] leading0 = new ArrayList[11];
        for (int i = 0; i < 11; i++) {
            ans[i] = new ArrayList<>();
            leading0[i] = new ArrayList<>();
        }
        for (long i = 1; i <= 9; i++) {
            ans[1].add(String.valueOf(i));
        }
        leading0[1].add(String.valueOf(0));

        for (int i = 1; i <= 9; i++) {
            for (String val : leading0[1]) {
                if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                    ans[2].add(i + val);
                }
            }
            for (String val : ans[1]) {
                if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                    ans[2].add(i + val);
                }
            }
        }
        if (K <= total + ans[2].size()) {
            /*
            for (int i=1; i<=10; i++) {
                System.err.print(i + "(" + ans[i].size() + "):");
                for (String val : ans[i]) {
                    System.err.print(" " + val);
                }
                System.err.println();
            }
             */

            return ans[2].get(K - total - 1);
        }
        total += ans[2].size();
        leading0[2].add("00");
        leading0[2].add("01");

        for (int k = 3; k <= 10; k++) {
            for (int i = 1; i <= 9; i++) {
                for (String val : leading0[k - 1]) {
                    if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                        ans[k].add(i + val);
                    }
                }

                for (String val : ans[k - 1]) {
                    if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                        ans[k].add(i + val);
                    }
                }
            }
            Collections.sort(ans[k]);

            if (K <= total + ans[k].size()) {
                /*
                for (int i=1; i<=10; i++) {
                    System.err.print(i + "(" + ans[i].size() + "):");
                    for (String val : ans[i]) {
                        System.err.print(" " + val);
                    }
                    System.err.println();
                }
                 */

                return ans[k].get(K - total - 1);
            }
            total += ans[k].size();
            for (String val : leading0[k-1]) {
                leading0[k].add("0" + val);
            }
            for (String val : ans[k-1]) {
                if (Math.abs(val.charAt(0) - '0') <= 1) {
                    leading0[k].add("0" + val);
                }
            }
        }

        return "-1";
    }

    /**
     * https://drken1215.hatenablog.com/entry/2020/04/05/150900 解法1-1
     * 最大で10桁までとわかるのでDFSで列挙する
     * @param K
     * @return
     */
    private static String solveDFS(int K) {
        List<Long> list = new ArrayList<>();

        for (int v=1; v<10; v++) {
            solveDFSIter(1, v, list);
        }

        Collections.sort(list);

        return String.valueOf(list.get(K-1));
    }

    private static void solveDFSIter(int d, long val, List<Long> list) {
        list.add(val);

        if (d == 10) return;

        for (int j=-1; j<=1; j++) {
            int add = (int)val%10 + j;
            if (add >= 0 && add <= 9) {
                solveDFSIter(d+1, val*10+add, list);
            }
        }
    }

    /**
     * https://drken1215.hatenablog.com/entry/2020/04/05/150900 解法1-2
     * DFSで列挙する際にd桁のものを順にすべて求める
     * @param K
     * @return
     */
    private static String solveDFSNonIter(int K) {
        List<Long> all = new ArrayList<>();

        List<Long> cur = new ArrayList<>();
        for (int v=1; v<10; v++) {
            cur.add((long)v);
            all.add((long)v);
        }

        for (int d=1; d<10; d++) {
            cur = calcNext(cur);
            all.addAll(cur);
        }

        return String.valueOf(all.get(K-1));
    }

    private static List<Long> calcNext(List<Long> cur) {
        List<Long> res = new ArrayList<>();

        for (long val : cur) {
            for (int j=-1; j<=1; j++) {
                int add = (int)(val %10) + j;
                if (add >= 0 && add <= 9) {
                    res.add(val*10 + add);
                }
            }
        }

        return res;
    }

    /**
     * https://drken1215.hatenablog.com/entry/2020/04/05/150900 解法2
     * @param K
     * @return
     */
    private static String solvePriorityQueue(int K) {
        Queue<Long> queue = new PriorityQueue<>();

        for (int i=1; i<10; i++) {
            queue.add((long)i);
        }

        for (int i=0; i<K-1; i++) {
            long s = queue.poll();
            for (int j=-1; j<=1; j++) {
                int add = (int) s%10 + j;
                if (add >= 0 && add <= 9) {
                    queue.add(s*10 + add);
                }
            }
        }

        return String.valueOf(queue.poll());
    }
}