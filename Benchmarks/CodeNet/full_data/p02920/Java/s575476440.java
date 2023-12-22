
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, Integer[]> map = new TreeMap<>();
    int n = sc.nextInt();
    int pow = (int) Math.pow(2, n);
    for (int i = 0; i < pow; i++) {
      map.computeIfAbsent(sc.nextInt(), a-> new Integer[]{0})[0]++;
    }
    boolean crct = true;
    for (Map.Entry<Integer, Integer[]> integerEntry : map.entrySet()) {
      if (integerEntry.equals(map.lastEntry())) {
        break;
      }
      final Integer integer = integerEntry.getValue()[0];
      if ((pow - integer < integer)) {
        crct = false;
        break;
      }
      pow -= integer;
    }
    System.out.println(crct ? "Yes" : "No");
  }
}
