import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "internationalization";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.length() - 2);
        sb.append(s.charAt(s.length() - 1));

        System.out.println(new String(sb));
    }
}
