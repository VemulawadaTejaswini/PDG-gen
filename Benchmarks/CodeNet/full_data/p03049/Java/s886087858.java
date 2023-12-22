import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        List<String> s = new ArrayList<>();
        int endsWithA = 0;
        int beginsWithB = 0;
        int both = 0;
        for (int i=0; i < n; i++) {
            String t = sc.next();
            s.add(t);
            if (t.startsWith("B") && !t.endsWith("A"))
                beginsWithB++;
            else if (t.endsWith("A") && !t.startsWith("B"))
                endsWithA++;
            else if (t.endsWith("A") && t.startsWith("B"))
                both++;
        }

        int ans = 0;
        for (String e : s) {
            ans += containsHowManyAB(e);
        }

        if (both > 1) {
            ans += both - 1;
        }
        if (both > 0) {
            if (endsWithA > beginsWithB) {
                endsWithA--;
                ans++;
            }
            if (endsWithA < beginsWithB) {
                beginsWithB--;
                ans++;
            }
        }

        ans += endsWithA > beginsWithB ? beginsWithB : endsWithA;
        System.out.println(ans);
    }

    private static int containsHowManyAB(String s) {
        int ret = 0;
        for (int i=0; i < s.length()-1; i++) {
            if (s.substring(i, i+2).equals("AB"))
                ret++;
        }
        return ret;
    }

}
