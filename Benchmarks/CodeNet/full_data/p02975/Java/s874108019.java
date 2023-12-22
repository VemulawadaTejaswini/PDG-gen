import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    if (possible(a)) System.out.println("Yes");
    else System.out.println("No");
  }

  private static boolean possible(int[] a) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : a) freq.put(n, freq.getOrDefault(n, 0) + 1);

    Integer[] keys = freq.keySet().toArray(new Integer[]{});
    if (keys.length == 1) return keys[0] == 0;

    int p = keys[0];
    int c = keys[1];
    dec(freq, c);
    while (!freq.isEmpty()) {
      int n = p ^ c;
      if (!dec(freq, n)) return false;
      p = c;
      c = n;
    }
    return true;
  }

  private static boolean dec(Map<Integer, Integer> map, int key) {
    int f = map.getOrDefault(key, 0);
    if (f == 0) return false;
    if (f == 1) map.remove(key);
    else map.put(key, f - 1);
    return true;
  }
}
