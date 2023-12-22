import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        List<Integer> red = new ArrayList<>();
        red.add(-1);
        List<Integer> green = new ArrayList<>();
        green.add(-1);
        List<Integer> blue = new ArrayList<>();
        blue.add(-1);
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'R') {
                red.add(i);
                continue;
            }
            if (d[i] == 'G') {
                green.add(i);
                continue;
            }
            if (d[i] == 'B') {
                blue.add(i);
                continue;
            }
        }
        red.add(N);
        green.add(N);
        blue.add(N);
        long ans = 0;
        int red_len = red.size();
        int green_len = green.size();
        int blue_len = blue.size();
        ans += count(N, red, green, blue);
        ans += count(N, blue, green, red);
        ans += count(N, green, red, blue);
        ans += count(N, blue, red, green);
        ans += count(N, green, blue, red);
        ans += count(N, red, blue, green);
        System.out.println(ans);
    }

    private long count(int N, List<Integer> red, List<Integer> green, List<Integer> blue) {
        int red_len = red.size();
        int blue_len = blue.size();
        long ans = 0;
        for (int g : green) {
            if (g == -1 || g == N) {
                continue;
            }
            int right_most_red = Collections.binarySearch(red, g);
            right_most_red = (0 <= right_most_red) ? right_most_red: ~right_most_red;
            if (right_most_red == red_len - 1) {
                right_most_red -= 1;
            }
            while (g <= red.get(right_most_red)) {
                right_most_red -= 1;
            }
            if (right_most_red == 0) {
                continue;
            }
            int left_most_blue = Collections.binarySearch(blue, g);
            left_most_blue = (0 <= left_most_blue) ? left_most_blue : ~left_most_blue;
            if ( left_most_blue == blue_len - 1) {
                continue;
            }
            HashSet<Integer> rc = new HashSet<>();
            for (int i = 1; i <= right_most_red; i++) {
                rc.add(g - red.get(i));
            }
            long red_size = rc.size();
            HashSet<Integer> bc = new HashSet<>();
            for (int i = left_most_blue; i < blue_len - 1; i++) {
                bc.add(blue.get(i) - g);
            }
            long blue_size = bc.size();
            for (int x : bc) {
                rc.remove(x);
            }
            long common = red_size - rc.size();
            ans += red_size * blue_size - common;
        }
        return ans;
    }
}
