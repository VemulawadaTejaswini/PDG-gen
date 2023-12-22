import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();

        System.out.println(N.contains("7") ? "Yes" : "No");
    }
}