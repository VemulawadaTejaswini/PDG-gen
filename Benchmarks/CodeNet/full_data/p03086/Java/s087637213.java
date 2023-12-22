import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final List<Character> ACGT = Arrays.asList('A', 'C', 'G', 'T');
        final String S = sc.next();

        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); i++) {
            if (ACGT.contains(S.charAt(i))) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }

        System.out.println(ans);
    }
}
