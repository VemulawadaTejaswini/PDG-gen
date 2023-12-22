
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        int res = x - a;
        int res2 = res % b;
        System.out.println(res2);

    }
}
