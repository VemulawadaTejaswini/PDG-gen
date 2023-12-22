import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        if (S.indexOf("A") >= 0 && S.indexOf("B") >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
