import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        int p = (int) (l % 2019);
        int q = (int) (r % 2019);

        if (r - l >= 2019) {
            System.out.println(0);
            return;
        }

        if (p > q ) {
            System.out.println(0);
            return;
        }

        System.out.println(l * (l+1) % 2019);

    }

}
