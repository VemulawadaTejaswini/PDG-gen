import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        String[] addeds = {"dream", "dreamer", "erase", "eraser"};
        String s = sc.next();

        while (s.length() > 0) {
            boolean f = false;
            for (String added : addeds) {
                if (s.startsWith(added, s.length() - added.length())) {
                    s = s.substring(0, s.length() - added.length());
                    f = true;
                    break;
                }
            }

            if (f == false) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
