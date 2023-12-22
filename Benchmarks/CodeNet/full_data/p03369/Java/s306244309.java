import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int topping = 0;

        for (int i = 0; i < S.length(); i++) {
            if ('o' == S.charAt(i)) {
                topping++;
            }
        }

        System.out.print(700 + (topping * 100));
    }
}