import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long q = sc.nextInt();
        long h = sc.nextInt();
        long s = sc.nextInt();
        long d = sc.nextInt();
        int n = sc.nextInt();
        long[] array = {
                8 * q,
                4 * h,
                2 * s};
        Arrays.sort(array);
        if (array[0] <= d) {
            System.out.println(array[0] / 2 * n);
        } else {
            if (n % 2 == 0) {
                n /= 2;
                System.out.println(d * n);
            } else {
                n /= 2;
                System.out.println(d * n + array[0] / 2);
            }
        }
    }
}