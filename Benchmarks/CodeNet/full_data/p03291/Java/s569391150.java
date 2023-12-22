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
        String S = scan.next();
        char[] data = S.toCharArray();
        TreeMap<Integer, Integer> a = tree('A', data);
        TreeMap<Integer, Integer> b = tree('B', data);
        TreeMap<Integer, Integer> c = tree('C', data);
        TreeMap<Integer, Integer> questions = tree('?', data);
        int Q = questions.size() - 2;
        long ans = 0;
        long mod = 1000000007;
        for (int center : b.keySet()) {
            if (center == 0 || center == 100010) {
                continue;
            }
            int x_right = a.lowerKey(center);
            int x_right_count = a.get(x_right);
            int x_question = questions.floorKey(x_right);
            int x_question_count = questions.get(x_question);
            long left1 = (long) (x_right_count - x_question_count) * pow(3, x_question_count, mod);
            left1 %= mod;
            long left2 = x_question_count < 1 ? 0 : x_question_count * pow(3, x_question_count - 1, mod);
            left2 %= mod;
            long left = left1 + left2;
            left %= mod;

            int z_left = c.higherKey(center);
            int z_left_count = c.size() - c.get(z_left) - 1;
            int z_question = questions.ceilingKey(z_left);
            int z_question_count = questions.size() - questions.get(z_question) - 1;
            long right1 = (long) (z_left_count - z_question_count) * pow(3, z_question_count, mod);
            right1 %= mod;
            long right2 = z_question_count < 1 ? 0 : z_question_count * pow(3, z_question_count - 1, mod);
            right2 %= mod;
            long right = right1 + right2;
            right %= mod;

            long subtotal = left * right;
            subtotal %= mod;
            ans += subtotal;
            ans %= mod;
        }
        System.out.println(ans);
    }
    long pow(int base, int count, long mod) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            long x = base * pow(base, count - 1, mod);
            x %= mod;
            return x;
        }
        long x = pow(base, count/2, mod);
        x %= mod;
        x *= x;
        x %= mod;
        return x;
    }
    TreeMap<Integer, Integer> tree(char target, char[] data) {
        TreeMap<Integer, Integer> x = new TreeMap<>();
        int count = 0;
        x.put(0, count);
        for (int i = 1; i <= data.length; i++) {
            if (data[i-1] == target || data[i-1] == '?') {
                x.put(i, ++count);
            }
        }
        x.put(100010, ++count);
        return x;

    }
}
