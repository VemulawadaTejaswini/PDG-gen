import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        boolean strongPalindrome = false;
        if (isPalindrome(line)) {
            if (isPalindrome(line.substring(0, (line.length() - 1 )/ 2))){
                strongPalindrome = true;
            }
        }

        System.out.println(strongPalindrome ? "Yes" : "No");

    }

    private static boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}