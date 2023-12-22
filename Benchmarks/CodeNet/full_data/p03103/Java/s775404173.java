import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Shop<Long, Long>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            list.add(new Shop<Long, Long>(a, b));
        }

        sc.close();

        list.sort(Comparator.comparing(Shop::getA));

        long ans = 0;

        for (Shop shop : list) {
            if (m <= shop.b) {
                ans += shop.a * m;
                break;
            }
            ans += shop.a * shop.b;
            m -= shop.b;
        }

        System.out.println(ans);
    }

    public static class Shop<a, b> {
        public long a;
        public long b;

        public Shop(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public long getA() {
            return this.a;
        }

        public long getB() {
            return this.b;
        }

    }
}