import java.util.*;

/**
 * @Author :花のQ
 * @create 2020/4/19 10:32
 **/
public class SecondClass {
    static Scanner scanner = new Scanner(System.in);
    static int[][] wAv;

    public static void main(String[] args) {
        int number = scanner.nextInt();
        int capacity = scanner.nextInt();
        wAv = new int[number][2];
        for (int i = 0; i < wAv.length; i++) {
            wAv[i][0] = scanner.nextInt();
            wAv[i][1] = scanner.nextInt();
        }
        System.out.println(Dp(number - 1, capacity));
    }

    public static int Dp(int n, int c) {
        if (n < 0)
            return 0;
        else if (wAv[n][0] > c)
            return Dp(n - 1, c);
        else
            return Math.max(Dp(n - 1, c - wAv[n][0]) + wAv[n][1], Dp(n - 1, c));
    }
}