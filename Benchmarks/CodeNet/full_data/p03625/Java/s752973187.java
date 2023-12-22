import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // キー文字で降順
        Map<Integer, Integer> cnts = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                if (t1.compareTo(t2) > 0) {
                    return -1;
                } else if (t1.compareTo(t2) == 0) {   //すでに存在していたら上書き
                    return 0;
                }
                return 1;
            }
        });

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            int cnt = 1;
            if (cnts.containsKey(a)) {
                cnt += cnts.get(a);
            }
            cnts.put(a, cnt);
        }

        int l1 = 0;
        int l2 = 0;
        for (Map.Entry e : cnts.entrySet()) {
            int length = (int) e.getKey();
            int num = (int) e.getValue();

            if (num >= 4 && l1 == 0) {
                l1 = l2 = length;
                break;
            }

            if (num >= 2) {
                if (l1 == 0) {
                    l1 = length;
                    continue;
                } else {
                    l2 = length;
                    break;
                }
            }
        }

        out.println((long) l1 * l2);
    }
}