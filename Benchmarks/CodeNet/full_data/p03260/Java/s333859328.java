import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        String prev = sc.next();
        set.add(prev);
        boolean wrong = false;
        for (int i = 0; i < N - 1; ++i) {
            String cur = sc.next();
            if (cur.charAt(0) != prev.charAt(prev.length() - 1) || set.contains(cur)) {
                wrong = true;
            }
            prev = cur;
            set.add(cur);
        }

        System.out.println(wrong ? "No" : "Yes");
    }
}
