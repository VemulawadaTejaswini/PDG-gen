import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static PrintWriter out;
    static Scanner sc;

    static void solve() {
        int n = nextInt();

        List<Integer> soutedList = new ArrayList<>();
        List<Integer> originalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            soutedList.add(x);
            originalList.add(x);
        }

        sort(soutedList);

        int left = soutedList.get(n / 2 - 1);
        int right = soutedList.get(n / 2);

        for (int i = 0; i < n; i++) {
            int removedElement = originalList.get(i);
            if (removedElement <= left) {
                out.print(right);
            } else {
                out.print(left);
            }
            out.println();
        }

    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static String nextString() {
        return sc.next();
    }

    static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        out = new PrintWriter(System.out);
        sc = new Scanner(System.in);

        solve();

        out.flush();
        sc.close();
    }

}
