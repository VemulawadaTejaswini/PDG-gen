import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    List<Store> stores = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      Store store = new Store(sc.nextInt(),sc.nextInt());
      stores.add(store);
    }

    stores.sort(Comparator.comparing(Store::getPrice));

    int result = 0;
    int count = 0;

    for (Store store: stores) {

      for (int i = 0; i < store.max; i++) {
        result += store.price;
        count++;

        if(count == m) {
          System.out.println(result);
          return;
        }
      }
    }
  }

  static class Store {
    int price;
    int max;

    public Store(int price, int max) {
      this.price = price;
      this.max = max;
    }

    public int getPrice() {
      return price;
    }
  }

}
