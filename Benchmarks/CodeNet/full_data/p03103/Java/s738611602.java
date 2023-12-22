import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        Shop[] shoplist = new Shop[N];
        for (int i = 0; i < N; i++) {
            Shop shop = new Shop();
            shop.A = scan.nextInt();
            shop.B = scan.nextInt();
            shoplist[i] = shop;
        }
        Arrays.sort(shoplist, new ShopComparator());
        long answer = 0;
        int remain = M;
        for (int i = 0; i < N && 0 < remain; i++) {
            int number = Math.min(remain, shoplist[i].B);
            remain -= number;
            answer += (long) number * (long) shoplist[i].A;
        }
        System.out.println(answer);
    }
    class Shop {
        int A = 0;
        int B = 0;
    }
    class ShopComparator implements Comparator<Shop> {

        @Override
        public int compare(Shop o1, Shop o2) {
            if (o1.A < o2.A) {
                return -1;
            }
            if (o1.A > o2.A) {
                return 1;
            }
            return -Integer.compare(o1.B, o2.B);
        }
    }
}
