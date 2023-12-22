
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        x = input.nextInt();
        y = input.nextInt();
        if (x % y == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
