
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {

            int x = in.nextInt() - 1;
            a[x] = i;

        }

        for (int i = 0; i < n - 1; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println(a[n - 1]);

    }

}
