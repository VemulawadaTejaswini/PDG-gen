import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = Integer.parseInt(s.next());
        List<Integer> list = new ArrayList<>();
        list.add(S);
        for (int i = 1;; i++) {
            int n = f(list.get(i - 1));
            if (list.contains(n)) {
                System.out.println(i + 1);
                return;
            }
            list.add(n);
            if (i > 10000) {
                System.out.println(i);
                return;
            }
        }
    }

    static int f(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        return 3 * n + 1;
    }
}