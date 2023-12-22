import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            char[] c = in.next().toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if (!map.containsKey(s)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(s, list);
            }
            else {
                ArrayList<Integer> list = map.get(s);
                list.add(i);
            }
        }
        long ans = 0;
        Set<String> keySet = map.keySet();
        for (String t : keySet) {
            ArrayList<Integer> list = map.get(t);
            int m = list.size();
            ans += (long)(m - 1) * m / 2;
        }
        out.println(ans);
        out.close();
    }
}
