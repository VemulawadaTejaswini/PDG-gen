import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static int price;
    private static int[] disable;

    public static void main(String[] args) {
        init();
        int pay = price;
        int base = 1;
        while (base < 10000) {
            int inc = inc(pay, base);
            if (0 < inc) {
                pay += inc;
                continue;
            }
            base *= 10;
        }
        System.out.println(pay);
    }

    private static int inc(int pay, int base) {
        if (pay < base) return 0;
        int num = (pay % (base * 10)) / base;
        for (int i = 0; i < disable.length; i++) {
            if (num < disable[i]) break;
            if (num == disable[i]) return base;
        }
        return 0;
    }

    private static void init() {
        price = sc.nextInt();
        int len = sc.nextInt();
        disable = new int[len];
        for (int i = 0; i < len; i++) {
            disable[i] = sc.nextInt();
        }
        sc.nextLine();
    }
}