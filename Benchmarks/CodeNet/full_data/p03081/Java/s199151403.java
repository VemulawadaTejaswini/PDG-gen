import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int DIRECTION_LEFT = -1;
    private static int DIRECTION_RIGHT = -1;
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Q = scan.nextInt();
        String s = scan.next();
        List<Query> list = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            char c = scan.next().toCharArray()[0];
            char direction = scan.next().toCharArray()[0];
            int d = 'L' == direction ? -1 : 1;
            Query q = new Query();
            q.c = c;
            q.d = d;
            list.add(q);
        }
        s = "@" + s + "@";
        Status status = new Status(N, s, list);
        int left_index = find(status, 0, N + 1, 0);
        int right_index = find(status, N + 1, 0, N + 1);
        if (right_index <= left_index) {
            System.out.println(0);
        } else {
            System.out.println(right_index - left_index - 1);
        }
    }

    private int find(Status status, int lower, int upper, int expected_position) {
        while (Math.abs(upper - lower) > 1) {
            int middle = (lower + upper) / 2;
            if (status.apply_move(middle, expected_position)) {
                lower = middle;
            } else {
                upper = middle;
            }
        }
        boolean x = status.apply_move(lower, expected_position);
        if (x) {
            return lower;
        }
        return upper;
    }

    class Status {
        private int N;
        private int[] data;
        private char[] problem;
        private List<Query> queries;
        Status(int N, String s, List<Query> queries) {
            this.N = N;
            HashMap<Character, List<Integer>> m = new HashMap<>();
            this.problem = s.toCharArray();
            this.queries = queries;
            init();
        }
        void init() {
            int[] data = new int[N+2];
            Arrays.fill(data, 1);
            data[0] = 0;
            data[N+1] = 0;
            this.data = data;
        }
        boolean apply_move(int position, int expected_position) {
            int current_position = position;
            if (is_end(current_position, expected_position)) {
                return true;
            }
            for(Query q : queries) {
                if (problem[current_position] == q.c) {
                    current_position += q.d;
                }
                if (is_end(current_position, expected_position)) {
                    return true;
                }
            }
            return false;
        }
        boolean is_end(int current_position, int expected_position) {
            return current_position == expected_position;
        }
    }
    class Query {
        char c;
        int d;
    }
}
