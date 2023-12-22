
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int temp = n;
        while (n / 10 > 0) {
           s += n % 10;
           n /= 10;
        }

        if (temp % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}