import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

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

        tree = IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toArray(List[]::new);
        val = new int[n];
        IntStream.range(0, n - 1).forEach(i -> tree[sc.nextInt() - 1].add(sc.nextInt() - 1));
        IntStream.range(0, q).forEach(i -> add(sc.nextInt() - 1, sc.nextInt()));

        outAll(val);
    }

    private void add(int index, int v) {
        val[index] += v;
        for (int next:tree[index]) {
            add(next, v);
        }
    }

    List<Integer>[] tree;
    int[] val;

    private <T> void outAll(T[] a) {
        System.out.print(a[0]);
        Arrays.stream(a).skip(1).forEach(o -> {
            System.out.print(' ');
            System.out.print(o);
        });
    }

    private void outAll(int[] a) {
        System.out.print(a[0]);
        Arrays.stream(a).skip(1).forEach(o -> {
            System.out.print(' ');
            System.out.print(o);
        });
    }
}
