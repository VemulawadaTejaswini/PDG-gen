import java.util.*;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Shop> shops = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            shops.add(new Shop(sc.nextInt(), sc.nextInt()));
        }
        shops.sort((a, b) -> a.value - b.value);

        long sumValue = 0; // answer
        int sumCount = 0;
        for (Shop shop : shops) {
            for (int j = 0; j < shop.count; j++) {
                sumValue += shop.value;
                sumCount++;
                if (sumCount == M) {
                    System.out.print(sumValue);
                    return;
                }
            }
        }
    }
    class Shop {
        int value;
        int count;
        Shop(int value, int count) {
            this.value = value;
            this.count = count;

        }
    }
    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}
