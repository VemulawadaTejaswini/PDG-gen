import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static final void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int H = sc.nextInt();
        int W = sc.nextInt();

        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < H; i++) {
            char[] carray = sc.next().toCharArray();
            for (char c : carray) {
                m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
            }
        }
        int[] counts = new int[5];
        Arrays.fill(counts, 0);
        for (int v : m.values()) {
            counts[4] += (v / 4);
            v %= 4;
            counts[2] += (v / 2);
            v %= 2;
            counts[1] += v;
        }

        if (W % 2 == 0 && H % 2 == 0) {
            if (counts[1] != 0 || counts[2] != 0) No();
            Yes();
        }

        if (W % 2 == 1 && H % 2 == 1) {
            while (counts[2] < (W - 1)/2 + (H - 1)/2) {
                counts[2] += 2;
                counts[4] -= 1;
            }
            if (counts[1] != 1) No();
            if (counts[2] != (W - 1)/2 + (H - 1)/2) No();
            if (counts[4] != (W - 1)/2 * (H - 1)/2) No();
            Yes();
        }

        int even = (W % 2 == 0) ? W : H;
        int odd = (W % 2 == 1) ? W : H;
        while (counts[2] < even/2) {
            counts[2] += 2;
            counts[4] -= 1;
        }

        if (counts[1] != 0) No();
        if (counts[2] != even/2) No();
        if (counts[4] != (even)/2 * (odd - 1)/2) No();
        Yes();
    }



    void No() {
        System.out.println("No");
        System.exit(0);
    }
    void Yes() {
        System.out.println("Yes");
        System.exit(0);
    }
}
class Utils {
    void swap(int a, int b, int[] array) {
        int c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
    void swap(int a, int b, char[] array) {
        char c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
}