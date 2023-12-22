import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.next());
        int g = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        scanner.close();

        int rgb = r * 100 + g * 10 + b;

        if (rgb % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
