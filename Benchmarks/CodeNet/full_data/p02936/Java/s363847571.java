import java.io.PrintWriter;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] arg) {
        Main m = new Main();
        m.run();
        m.close();
    }

    private Scanner sc;

    private Main() {
        sc = new Scanner(System.in);
    }
    private void close() {
        sc.close();
    }

    private void run() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        tree = new List[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList();
        }
        visited = new boolean[n];
        val = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            tree[a].add(b);
            tree[b].add(a);
        }
        inputs = new int[n];

        for (int i = 0; i < q; i++) {
            inputs[sc.nextInt() - 1] += sc.nextInt();
        }

        add(0, 0);

        outAll(val);
    }

    private void add(int index, int parentValue) {
        val[index] += parentValue + inputs[index];
        visited[index] = true;
        for (int next : tree[index]) {
            if (!visited[next]) add(next, val[index]);
        }
    }

    List<Integer>[] tree;
    boolean[] visited;
    int[] val;
    int[] inputs;

    private <T> void outAll(T[] a) {
        PrintWriter out = new PrintWriter(System.out);
        System.out.print(a[0]);
        int len = a.length;
        for (int i = 1; i < len; i++) {
            out.print(' ');
            out.print(a[i]);
        }
        out.flush();
    }

    private void outAll(int[] a) {
        PrintWriter out = new PrintWriter(System.out);
        System.out.print(a[0]);
        int len = a.length;
        for (int i = 1; i < len; i++) {
            out.print(' ');
            out.print(a[i]);
        }
        out.flush();
    }
}
