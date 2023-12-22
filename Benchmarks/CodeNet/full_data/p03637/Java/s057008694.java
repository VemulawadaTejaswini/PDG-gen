import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
//    private static final String ex = "3\n" +
//            "1 10 100";
    private static final String ex = "6\n" +
        "2 7 1 8 2 8";
//    private static final String ex = "2\n" +
//        "1 1";
//    private static final String ex = "3\n" +
//        "1 4 1";
//    private static final String ex = "4\n" +
//            "1 2 3 4";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        Integer N = Integer.parseInt(scanner.nextLine());

        int even2 = 0;
        int even4 = 0;
        int odd = 0;
        String split[] = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i ++) {
            int num = Integer.parseInt(split[i]);

            if (num % 2 == 1) {
                odd ++;
            } else if (num % 4 == 0) {
                even4 ++;
            } else {
                even2 ++;
            }
        }

        if (even2 > 0) odd ++;

        String result = odd > (even4 + 1) ? "No" : "Yes";

        System.out.println(result);
    }
}
