import java.util.*;

public class Main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer>  box = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        if(n % 2 == i % 2) {
            box.add(0, sc.nextInt());
        } else {
            box.add(sc.nextInt());
        }
      }
      box.stream()
              .forEach(e -> System.out.print(e));
  }
}