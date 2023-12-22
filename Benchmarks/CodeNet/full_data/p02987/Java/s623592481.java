import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();

        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (count.containsKey(ch))
                count.put(ch, count.get(ch) + 1);
            else
                count.put(ch, 1);
        }

        boolean flag = false;
        if (count.size() == 2) {
            for (Map.Entry<Character, Integer> e : count.entrySet()) {
                if (e.getValue() != 2)
                    break;
            }
            flag = true;
        }

        out.println(flag ? "Yes" : "No");
    }

}
