import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        for (int i = 1; i <= n; i++) {
            h = h - Integer.parseInt(scanner.next());
        }
        if (h <= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}