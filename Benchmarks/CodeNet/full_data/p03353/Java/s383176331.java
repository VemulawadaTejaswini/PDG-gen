import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int k = sc.nextInt();

            Set<String> set = new TreeSet<>();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ch) {
                        for (int j = 1; j <= 5; j++) {
                            if (i + j <= s.length()) {
                                set.add(s.substring(i, i + j));
                            }
                        }
                    }
                }

                if (set.size() >= k) {
                    break;
                }
            }

            // System.out.println(set);
            List<String> list = new ArrayList<>(set);
            String ans = list.get(k - 1);

            System.out.println(ans);
        }
    }

}
