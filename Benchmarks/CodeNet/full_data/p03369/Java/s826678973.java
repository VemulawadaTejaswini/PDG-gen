import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int y = 700;
        if (s.charAt(0) == 'o') y += 100;
        if (s.charAt(1) == 'o') y += 100;
        if (s.charAt(2) == 'o') y += 100;
        System.out.println(y);
    }
}