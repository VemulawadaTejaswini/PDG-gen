import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long num = 0;
        long numB = 0;
        long numA = 0;
        if (k % 2 == 1) {
            for (int i = 1; i <= n; i++)
                if (i % k == 0)
                    num++;
            System.out.println((int) Math.pow(num, 3));
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % k == 0)
                    numA++;
                if (i % k == k / 2)
                    numB++;
            }
            System.out.println((int) Math.pow(numA, 3) + (int) Math.pow(numB, 3));
        }
    }
}
