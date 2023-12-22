import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if (Integer.toString(N).contains("7")) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
