
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(run(sc));
        sc.close();
    }

    private static String run(Scanner sc) {
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        if ((n % 2) != 0) {
            return "No";
        }
        String first = s.substring(0, n / 2);
        String last = s.substring((n / 2));
        if (first.equals(last)) {
            return "Yes";
        }
        return "No";
    }
}
