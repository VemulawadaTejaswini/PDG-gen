import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();
        System.out.println((char) (l.trim().charAt(0) + 1));
    }
}
