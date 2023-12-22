import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int b = 0;
        int r = 0;
        for (char c : s) {
            if (c == 'R') {
                r++;
            } else {
                b++;
            }
        }

        if (r > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}