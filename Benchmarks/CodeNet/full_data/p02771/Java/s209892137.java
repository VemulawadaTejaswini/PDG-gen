import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.next();

        String b = sc.next();

        String c = sc.next();

        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}