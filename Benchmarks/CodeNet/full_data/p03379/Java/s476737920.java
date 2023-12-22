import java.util.*;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n], y = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            y[i] = x[i];
        }

        Arrays.sort(y);
        int a = y[n/2 - 1], b = y[n/2];
        for (int i = 0; i < x.length; i++) {
            if (x[i] < y[n/2]) {
                System.out.println(b);

            } else {
                System.out.println(a);
            }
        }
    }
}