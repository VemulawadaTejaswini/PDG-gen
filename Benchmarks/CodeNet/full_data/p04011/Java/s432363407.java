
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int z;
        if (k > n) {
            System.out.println(x * n);
        } else {
            z = n - k;
            System.out.println((x * k) + (y * z));
        }
    }
}
