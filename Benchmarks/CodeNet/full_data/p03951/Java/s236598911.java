import java.util.Scanner;

public class Main {

    private void solveA(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int min = 0;
        for (int i = 1; i <= n; i++) {
            String check = t.substring(0, i);
            if (s.endsWith(check)) {
                min = i;
            }
        }
        System.out.println(n * 2 - min);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            Main app = new Main();
            app.solveA(sc);
        }
    }
}
