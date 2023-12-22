
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String[] s = scan.next().split("");

        SegTree st = new SegTree(s);

        int q = Integer.parseInt(scan.next());
        for (int i = 0; i < q; i++) {
            int a = Integer.parseInt(scan.next());
            if (a == 1) {
                int x = Integer.parseInt(scan.next());
                String y = scan.next();
                st.update(x, y);
            } else {
                int x = Integer.parseInt(scan.next());
                int y = Integer.parseInt(scan.next());
                x--;
                System.out.println(st.query(x, y).size());
            }
        }
        scan.close();

    }

    static class SegTree {
        int size = 1;
        List<Set<String>> node;

        public SegTree(String[] s) {
            while (size < s.length) {
                size *= 2;
            }
            node = new ArrayList<Set<String>>();
            for (int i = 0; i < 2 * size; i++) {
                node.add(new HashSet<String>());
            }

            for (int i = 0; i < s.length; i++) {
                update(i, s[i]);
            }
        }

        public void update(int x, String y) {
            int i = x + size - 1;
            node.get(i).add(y);
            while (i > 0) {
                i = (i - 1) / 2;
                node.get(i).addAll(node.get(2 * i + 1));
                node.get(i).addAll(node.get(2 * i + 2));
            }
        }

        public Set<String> query(int x, int y) {
            return query(x, y, 0, 0, size);
        }

        private Set<String> query(int x, int y, int k, int left, int right) {
            if (y <= left || right <= x) {
                return new HashSet<String>();
            }
            if (x <= left && right <= y) {
                return node.get(k);
            }

            Set<String> set = new HashSet<String>();
            set.addAll(query(x, y, 2 * k + 1, left, (left + right) / 2));
            set.addAll(query(x, y, 2 * k + 2, (left + right) / 2, right));
            return set;
        }

    }

}
