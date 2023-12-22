import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();
    int E = scan.nextInt();
    int result = 0;

    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    int a = A % 10;
    if (a == 0) {
      result += A;
    } else {
      map.put("A", a);
      map2.put("A", A);
    }
    int b = B % 10;
    if (b == 0) {
      result += B;
    } else {
      map.put("B", b);
      map2.put("B", B);
    }
    int c = C % 10;
    if (c == 0) {
      result += C;
    } else {
      map.put("C", c);
      map2.put("C", C);
    }
    int d = D % 10;
    if (d == 0) {
      result += D;
    } else {
      map.put("D", d);
      map2.put("D", D);
    }
    int e = E % 10;
    if (e == 0) {
      result += E;
    } else {
      map.put("E", e);
      map2.put("E", E);
    }

    if (map.isEmpty()) {
      System.out.println(result);
      return;
    }

    String key = map.entrySet().stream().min((k, v) -> k.getValue() - v.getValue()).get().getKey();

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (!entry.getKey().equals(key)) {
        result += (map2.get(entry.getKey()) / 10 + 1) * 10;
      }
    }
    result += map2.get(key);
    System.out.println(result);
  }
}
