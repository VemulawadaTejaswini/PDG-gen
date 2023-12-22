import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<Integer> MEMO = new HashSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        MEMO.add(a);
        solve(a);

        System.out.println(MEMO.size() + 1);

    }

    private static void solve(int a) {
        int tmp = 0;
        if (a % 2 == 0) {
            tmp = a / 2;
        } else {
            tmp = 3 * a + 1;
        }

        if (MEMO.contains(tmp)) {
            return;
        } else {
            MEMO.add(tmp);
        }

        solve(tmp);
    }
}
