import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else {
            int b1 = Arrays.binarySearch(a, x);
            int b2 = Arrays.binarySearch(a, y);
            if ((b1 >= 0 && b2 >= 0) || (b1 < 0 && b2 < 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}