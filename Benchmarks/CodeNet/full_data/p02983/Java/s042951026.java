import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());

        int init = L % 2019;
        int min1 = init;
        int min2 = Integer.MAX_VALUE;
        for (int i = L + 1; i <= R; i++) {
            if (i % 2019 == init) {
                break;
            }
            if (min1 > i % 2019) {
                min2 = min1;
                min1 = i % 2019;

            } else if (min2 > i % 2019) {
                min2 = i % 2019;
            }
        }

        System.out.println(min1 * min2);
    }
}
