import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        List<Character> list = Arrays.asList('A', 'C', 'G', 'T');

        int ans = 0;
        int candidate = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                candidate++;
                if (candidate > ans) {
                    ans = candidate;
                }
            } else {
                candidate = 0;
            }
        }

        System.out.println(ans);
    }

}
