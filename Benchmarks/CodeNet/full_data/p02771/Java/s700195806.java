import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();

        if (n == k) {
            if (n != c) {
                System.out.println("Yes");
                return;
            }
        } else if (k == c) {
            if (n != c) {
                System.out.println("Yes");
                return;
            }
        } else if (n == c) {
            if (k != c) {
                System.out.println("Yes");
                return;
            }

        } else {

        }
        System.out.println("No");
    }
}
