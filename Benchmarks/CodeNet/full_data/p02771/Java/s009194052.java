import java.util.Scanner;
 
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
 
        final boolean poor = (a == b && a != c) ||
                (a == c && a != b) || (b == c && b != a);
        if (poor) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}