import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.next();
        // スペース区切りの整数の入力

        String b = sc.next();

        String c = sc.next();

        {
            String tmp = a;

            a = b;

            b = tmp;
        }

        {
            String tmp = a;

            a = c;

            c = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}