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
        for (int b_position : b.keySet()) {
            if (b_position == 0 || b_position == 100010) {
                continue;
            }
            long left = count_a(a, questions, b_position, mod);
            long right = count_c(c, questions, b_position, mod);
            long subtotal = left * right;
            subtotal %= mod;

            ans += subtotal;
            ans %= mod;
        }
        System.out.println(ans);
    }

    long count_c(TreeMap<Integer, Integer> c, TreeMap<Integer, Integer> questions, int b_position, long mod) {
        int c_position_most_left = c.higherKey(b_position);
        int c_position_candidate_size = c.size() - c.get(c_position_most_left) - 1;
        int c_question_most_left = questions.ceilingKey(c_position_most_left);
        int c_question_candidate_size = questions.size() - questions.get(c_question_most_left) - 1;
        long right1 = (long) (c_position_candidate_size - c_question_candidate_size) * pow(3, c_question_candidate_size, mod);
        right1 %= mod;
        long right2 = c_question_candidate_size < 1 ? 0 : c_question_candidate_size * pow(3, c_question_candidate_size - 1, mod);
        right2 %= mod;
        long right = right1 + right2;
        right %= mod;
        return right;
    }

    long count_a(TreeMap<Integer, Integer> a, TreeMap<Integer, Integer> questions, int b_position, long mod) {
        int a_position_most_right = a.lowerKey(b_position);
        int a_position_cadidates_size = a.get(a_position_most_right);
        int a_question_most_right = questions.floorKey(a_position_most_right);
        int a_question_candidates_size = questions.get(a_question_most_right);
        long left1 = (long) (a_position_cadidates_size - a_question_candidates_size) * pow(3, a_question_candidates_size, mod);
        left1 %= mod;
        long left2 = a_question_candidates_size < 1 ? 0 : a_question_candidates_size * pow(3, a_question_candidates_size - 1, mod);
        left2 %= mod;
        long left = left1 + left2;
        left %= mod;
        return left;
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
