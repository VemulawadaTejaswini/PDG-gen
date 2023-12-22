import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        if (n >= 1 && n <= 100) {

            int meal = n * 800;

            int cashback = (n / 15) * 200;

            int total = meal - cashback;

            System.out.println(total);

        }

    }
}
