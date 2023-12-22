import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        int k = scan.nextInt();
        System.out.println(solve(s, k));
    }

    public static String solve(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        List<String> all_candidate_list = new ArrayList<>();
        for(int i = 1; i <= k; i++) {
            all_candidate_list.addAll(substring(sb, i));
        }
        String[] all_candidates = all_candidate_list.toArray(new String[0]);
        Arrays.sort(all_candidates);
        return all_candidates[k-1];
    }

    public static List<String> substring(StringBuilder sb, int length) {
        HashSet<String> answer = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.length() < i + length) {
                continue;
            }
            String x = sb.substring(i, i+length);
            if (!answer.contains(x)) {
                answer.add(x);
            }
        }
        List<String> substrings = new ArrayList<>();
        for(String s: answer) {
            substrings.add(s);
        }
        return substrings;
    }
}
