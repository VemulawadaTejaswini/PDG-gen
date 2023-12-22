import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            int digitSum = 0;
            int tmp = i;
            while (tmp > 0) {
                digitSum += tmp % 10;
                tmp /= 10;
            }
            if (a <= digitSum && digitSum <= b)
                sum += i;
        }

        System.out.println(sum);
    }
}