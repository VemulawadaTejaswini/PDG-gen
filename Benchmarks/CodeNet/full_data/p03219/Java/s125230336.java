import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.next());
        int Y = Integer.parseInt(scanner.next());
        scanner.close();

        System.out.println(X + Y / 2);
    }
}
