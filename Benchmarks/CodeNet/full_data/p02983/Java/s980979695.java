import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();

        long x = l * (l / 2019);
        if (l - x <= 2019 && r - x >= 2019) {
            System.out.println(0);
        } else {
            long result = (l % 2019) * ((l + 1) % 2019) % 2019;
            System.out.println(result);
        }
    }
}
