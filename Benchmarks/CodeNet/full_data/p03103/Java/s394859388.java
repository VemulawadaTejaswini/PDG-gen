import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(final String[] ars) {
    final Scanner scanner = new Scanner(System.in);
    final int N = Integer.parseInt(scanner.next());
    final int M = Integer.parseInt(scanner.next());
    final List<Shop> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(new Shop(Long.parseLong(scanner.next()), Long.parseLong(scanner.next())));
    }
    list.sort(Comparator.comparingLong(e -> e.price));

    long price = 0;
    long count = 0;
    for (final Shop shop : list) {
      if (count + shop.count >= M) {
        price += (M - count) * shop.price;
        break;
      }
      count += shop.count;
      price += shop.count * shop.price;
    }
    System.out.println(price);
  }
}


class Shop {
  Long price;
  Long count;

  public Shop(final Long price, final Long count) {
    this.price = price;
    this.count = count;
  }
}