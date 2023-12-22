
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, a, b;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();

        if (x >= 1 && x <= 1000000000 && a >= 1 && a <= 1000000000 && b >= 1 && b <= 1000000000) {

            int BestByDate = a + a;
            int EatingDate = a + b;

            int Date = EatingDate - BestByDate;

            if (EatingDate <= BestByDate) {

                System.out.println("delicios");
            } else if (EatingDate <= BestByDate + x) {

                System.out.println("safe");
            } else {

                System.out.println("dangerous");
            }
        }
    }
}
