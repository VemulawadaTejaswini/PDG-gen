import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    static int N;
    static String S;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();

        solve();
    }

    static void solve() {

        int max = 0;
        for (int i = 1; i < N; i++) {

            String lhs = S.substring(0, i);
            String rhs = S.substring(i, N);

            max = Math.max(max, intersection(lhs, rhs));
        }

        System.out.println(max);
    }

    static int intersection(String s1, String s2) {

        Set<String> set1 = s1.chars().mapToObj(c -> String.valueOf((char)c)).distinct().collect(Collectors.toSet());
        Set<String> set2 = s2.chars().mapToObj(c -> String.valueOf((char)c)).distinct().collect(Collectors.toSet());

        set1.retainAll(set2);

        return set1.size();
    }

}
