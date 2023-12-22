import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, total1, total2, total3;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100) && (c >= 1 && c <= 100)) {

            total1 = a + b;
            total2 = b + c;
            total3 = c + a;

            if (total1 == c || total2 == a || total3 == b) {

                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }

    }
}
