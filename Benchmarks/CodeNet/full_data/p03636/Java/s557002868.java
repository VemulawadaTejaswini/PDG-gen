import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.nextLine();
        System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
    }
}