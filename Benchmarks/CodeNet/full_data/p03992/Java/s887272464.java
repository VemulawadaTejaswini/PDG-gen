import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String input = SCANNER.nextLine();
        System.out.println(input.substring(0, 4) + " " + input.substring(4));
    }
}