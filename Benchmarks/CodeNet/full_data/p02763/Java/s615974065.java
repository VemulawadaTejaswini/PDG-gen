
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        char[] s = scan.next().toCharArray();

        List<SegTree> stList = new ArrayList<SegTree>();
        for (int i = 0; i < 26; i++) {
            stList.add(new SegTree(s, i));
        }

        int q = Integer.parseInt(scan.next());
        for (int i = 0; i < q; i++) {
            int a = Integer.parseInt(scan.next());
            if (a == 1) {
                int x = Integer.parseInt(scan.next());
                x--;
                char[] y = scan.next().toCharArray();

                char curChar = s[x];
                stList.get(curChar - 'a').update(x, 0);
                stList.get(y[0] - 'a').update(x, 1);
                s[x] = y[0];
            } else {
                int x = Integer.parseInt(scan.next());
                int y = Integer.parseInt(scan.next());
                x--;
                int ans = 0;
                for (int j = 0; j < 26; j++) {
                    ans += stList.get(j).query(x, y);
                }
                System.out.println(ans);
            }
        }
        scan.close();

    }

    static class SegTree {
        int size = 1;
        int[] node;

        public SegTree(char[] s, int c) {
            while (size < s.length) {
                size *= 2;
            }
            node = new int[2 * size];
            for (int i = 0; i < 2 * size; i++) {
                node[i] = 0;
            }

            for (int i = 0; i < s.length; i++) {
                if (s[i] - 'a' == c) {
                    update(i, 1);
                }
            }
        }

        public void update(int x, int y) {
            int i = x + size - 1;
            node[i] = y;

            while (i > 0) {
                i = (i - 1) / 2;
                node[i] = Math.max(node[2 * i + 1], node[2 * i + 2]);
            }
        }

        public int query(int x, int y) {
            return query(x, y, 0, 0, size);
        }

        private int query(int x, int y, int k, int left, int right) {
            if (y <= left || right <= x) {
                return 0;
            }
            if (x <= left && right <= y) {
                return node[k];
            }

            int l = query(x, y, 2 * k + 1, left, (left + right) / 2);
            int r = query(x, y, 2 * k + 2, (left + right) / 2, right);
            return Math.max(l, r);
        }

    }

}
