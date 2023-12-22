import java.util.Scanner;
import java.util.TreeMap;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int D = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            Integer x = Integer.parseInt(scanner.next());
            Integer h = Integer.parseInt(scanner.next());
            m.put(x, h);
        }

        // TreeMap<Integer, Integer> bomb = new TreeMap<>();
        DynamicSegTree bomb = new DynamicSegTree(2_000_000_000);

        long ans = 0;
        while (!m.isEmpty()) {
            Integer at = m.firstKey();
            Integer v = m.firstEntry().getValue();
            int prev = (int) bomb.query(at - D, at + D);
            v -= A * prev;
            if (v <= 0) {
                m.remove(at);
                continue;
            }
            Integer cnt = v / A + (v % A == 0 ? 0 : 1);
            ans += cnt;
            bomb.update(at + D, cnt);
            m.remove(at);
        }

        System.out.println(ans);
    }
}


class DynamicSegTree {
    class Node {
        Node left;
        Node right;
        long val;
    }

    Node root;
    long size;

    public DynamicSegTree(long size) {
        this.size = Long.highestOneBit(size);
        if (size > this.size) {
            this.size <<= 1;
        }
        root = new Node();
    }

    void update(int index, long x) {
        Node curr = root;
        long l = 0, r = size;
        curr.val += x;
        while (r - l > 1) {
            long mid = (l + r) >>> 1;
            if (index < mid) {
                if (curr.left == null)
                    curr.left = new Node();
                curr = curr.left;
                r = mid;
            } else {
                if (curr.right == null)
                    curr.right = new Node();
                curr = curr.right;
                l = mid;
            }
            curr.val += x;
        }
    }

    long query(int a, int b) {
        return query(a, b, root, 0, size);
    }

    private long query(int a, int b, Node curr, long l, long r) {
        if (a <= l && r <= b) {
            return curr.val;
        }
        if (r <= a || b <= l) {
            return 0;
        }

        long left = curr.left == null ? 0 : query(a, b, curr.left, l, (l + r) >>> 1);
        long right = curr.right == null ? 0 : query(a, b, curr.right, (l + r) >>> 1, r);
        return left + right;
    }
}

