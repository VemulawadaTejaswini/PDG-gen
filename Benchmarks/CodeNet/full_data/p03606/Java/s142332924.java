package LycAlgo.Atcode.Septem9;

import java.util.Scanner;

/**
 * Created by lyc on 2017/10/12.
 */
class Main {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int total = 0;
        while (N-- != 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            total += (r - l) + 1;
        }
        System.out.print(total);
    }
}
