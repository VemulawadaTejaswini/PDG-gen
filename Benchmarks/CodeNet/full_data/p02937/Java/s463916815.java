import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] salp = new int[27];
        int[] talp = new int[27];
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();

        for (int i = 0; i < sr.length; i++) {
            salp[sr[i] - 'a']++;
        }
        for (int i = 0; i < tr.length; i++) {
            talp[tr[i] - 'a']++;
            if (salp[tr[i] - 'a'] == 0) {
                System.out.println(-1);
                return;
            }

        }

        for (int i = 0; i < 27; i++) {
            if (talp[i] > 0) {
                map.put((char) ('a' + i), new ArrayList<Integer>());
            }
        }

        long ans = 0;
        int pos = 0;
        for (int i = 0; i < sr.length; i++) {
            if (talp[sr[i] - 'a'] > 0) {
                map.get(sr[i]).add(i);
            }
        }
        for (int i = 0; i < sr.length; i++) {
            if (talp[sr[i] - 'a'] > 0) {
                map.get(sr[i]).add(i + sr.length);
            }
        }

        for (int i = 0; i < tr.length; i++) {
            ArrayList<Integer> list = map.get(tr[i]);
            // System.out.println(Arrays.toString(list.toArray()));
            int ret = binary_search(pos, list);
            if (ret == -1)
                throw new Exception("not found");
            int pps = list.get(ret);
            if (pps >= sr.length) {
                ans += sr.length;
            }
            pos = pps % sr.length;

            // System.out.println(pps + ", " + pos + ", " + ans);
        }
        System.out.println(ans + pos + 1);
    }

    // index が条件を満たすかどうか
    static boolean isOK(int index, int key, ArrayList<Integer> list) {
        if (list.get(index) >= key)
            return true;
        else
            return false;
    }

    // 汎用的な二分探索のテンプレ
    static int binary_search(int key, ArrayList<Integer> list) {
        int left = -1; // 「index = 0」が条件を満たすこともあるので、初期値は -1
        int right = (int) list.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
        /* どんな二分探索でもここの書き方を変えずにできる！ */
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isOK(mid, key, list))
                right = mid;
            else
                left = mid;
        }
        /* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
        return right;
    }
}
