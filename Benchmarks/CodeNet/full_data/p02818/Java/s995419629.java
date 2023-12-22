import java.util.Scanner;

/**
 *
 * @author قتادة
 */
public class NewClass {

    public static void num(int a, int b, int k) {
        int count = 0;
        while (count != k) {
            if (a >= 1) {
                a--;
                count++;
            } else if (b >= 1) {
                b--;
                count++;
            }
            else {
                break;
            }
        }
        System.out.println("a =" + a + "b =" + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        num(a, b, k);
    }
}
