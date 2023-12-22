import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        double left = 0;
        double right = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                right = n - (i + 1);
                break;
            }
            left++;
        }

        k--;

        System.out.println((int)Math.ceil(left/ k) + (int) Math.ceil(right / k));
    }
}