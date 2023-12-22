import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b , c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        scanner.close();

        if ( ((a < c) && (c < b)) || ((b < c) && (c < a))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}