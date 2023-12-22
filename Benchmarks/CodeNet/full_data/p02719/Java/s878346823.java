import java.util.Scanner;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt(), k = get.nextInt();
        System.out.println(Math.min((n % k), k - (n % k)));
    }
}
