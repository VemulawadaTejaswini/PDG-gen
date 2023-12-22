package arc067;

import java.util.Scanner;

/**
 * Created by zzt on 17-1-15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ret = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0)
                ret++;
        }
        System.out.println(ret);
    }
}