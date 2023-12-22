import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> set = new HashSet<>();
        for (int bit = 0; bit < (1 << n); bit++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((1 & (bit >> i)) == 1) {
                    sb.append(s.charAt(i));
                }
            }
            if (sb.toString().length() == 3) {
                set.add(sb.toString());
            }
        }
        System.out.println(set.size());
    }

}
