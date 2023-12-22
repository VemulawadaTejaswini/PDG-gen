import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      sc.nextLine();

      long[] prices = new long[N];
      long[] left = new long[N];
      for (int i = 0; i < N; i++) {
        prices[i] = sc.nextInt();
        left[i] = sc.nextInt();
      }

      long money = 0;
      while (0 < M) {
        int number = decideStore(prices, left);
        int bottles = M;
        M -= left[number];
        if (M < 0) {
          money += prices[number] * bottles;
        } else {
          money += prices[number] * left[number];
        }
        left[number] = 0;
      }

      System.out.println(money);
    }
  }

  public static int decideStore(long[] prices, long[] left) {
    long minPrice = 1000000000;
    for (int i = 0; i < prices.length; i++) {
      if (left[i] == 0) {
        continue;
      }
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
    }

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] == minPrice) {
        return i;
      }
    }

    return 0;
  }
}