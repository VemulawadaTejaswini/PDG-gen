import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        HashSet<Integer> m = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int d = scanner.nextInt();
            m.add(d);
        }
        System.out.println(m.size());
    }
}