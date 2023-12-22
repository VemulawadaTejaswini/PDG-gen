import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 5 && a == b && c == 7) {
            System.out.println("YES");
            return;
        }
        
        if (b == 5 && b == c && a == 7) {
            System.out.println("YES");
            return;
        }
        
        if (c == 5 && c == a && b == 7) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }
}