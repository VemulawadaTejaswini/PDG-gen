
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i=0; i<N; i++) {
            S[i] = sc.next();
        }

        String[] ans = solve(N, S);
        for (int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static String[] solve(int N, String[] S) {
        Map<String, Integer> map = new HashMap();
        int most = 0;

        for (int i=0; i<N; i++) {
            String key = S[i];
            int count = 0;

            if (map.containsKey(key)) {
                count = (Integer)map.get(key);
                map.put(key, (count+1));
            } else {
                map.put(key, 1);
            }

            most = Math.max(most, count+1);
        }

        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // System.err.println(entry.getKey() + ":" + entry.getValue());
            if (entry.getValue() == most) {
                ans.add(entry.getKey());
            }
        }


        Collections.sort(ans);

        return ans.toArray(new String[0]);
    }
}