import java.util.*;

public class Main {
    private static final int N = 26;

    public void main(Scanner sc) {
        char a[] = sc.next().toCharArray();
        sc.close();
        int len = a.length;

        Map<Character, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(a[i], new TreeSet<>());
            map.get(a[i]).add(i + 1);
        }

        int data[] = new int[len + 1];
        BitSet bset = new BitSet();
        data[len] = 0;
        for (int i = len - 1; i >= 0; i--) {
            bset.set(a[i] - 'a');
            data[i] = data[i + 1];
            if (bset.cardinality() == N) {
                bset.clear();
                data[i]++;
            }
        }

        int cntup[] = new int[data[0] + 2];
        for (int i = 0; i < len; i++) {
            if (data[i] != data[i + 1]) {
                cntup[data[0] - data[i + 1]] = i + 1;
            }
        }
        cntup[data[0] + 1] = len + 1;

        int p = 0;
        char ans[] = new char[data[0] + 1];
        for (int i = 0; i < ans.length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (!map.containsKey(c)) {
                    ans[i] = c;
                    p = len + 1;
                    break;
                } else {
                    Integer next = map.get(c).ceiling(p);
                    if (next == null || (data[p] - data[next] == 1)) {
                        ans[i] = c;
                        p = getOrDefault(next, len) + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(new String(ans));
    }

    private int getOrDefault(Integer n, int def) {
        return n == null ? def : n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
