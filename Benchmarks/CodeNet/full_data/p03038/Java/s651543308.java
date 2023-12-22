import java.util.*;

public class Main {
    static Scanner sc;
    static int n;
    static int m;
    static long[] a;
    static List<Tuple> bc = new ArrayList<>();
    static List<Node> nodes = new ArrayList<>();

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            Tuple t = new Tuple(sc.nextInt(), sc.nextInt());
            bc.add(t);
        }
        bc.sort((x, y) -> x.b - y.b);
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
//            int index= search(bc.get(i).b);
            for (int j = 0; j < bc.get(i).a && j < n; j++) {
                a[j] = Math.max(bc.get(i).b, a[j]);
            }
            Arrays.sort(a);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    static int search(int x) {
        if(a[n-1] > x) return n;
        int lft = 0;
        int rgt = n;
        while(rgt - lft > 1) {
            int mid = (lft + rgt) / 2;
            if(a[mid] <= x) {
                lft = mid;
            }
            else {
                rgt= mid;
            }
        }
        return lft;
    }

    static class Tuple {
        public int a;
        public int b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }

    static class Node {
        int num;
        Map<Node, Integer> next;
        int c = 0;

        public Node(int num) {
            this.num = num;
            next = new HashMap<>();
        }
    }
}

