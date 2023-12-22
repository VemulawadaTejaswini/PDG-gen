import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] arrA = new int[n];
    int[] arrB = new int[n];
    for (int i = 0; i < n; i++) {
      arrA[i] = sc.nextInt();
      arrB[i] = sc.nextInt();
    }
    sc.close();

    HashMap<String, Integer> result = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int a = arrA[i];
      int b = arrB[i];
      putBlack(result, a, b, h, w);
    }
    long[] count = new long[10];
    Arrays.fill(count, 0);
    count[0] = (long) (h - 2) * (long) (w - 2);
    for (int val : result.values()) {
      count[val] += 1;
      count[0] -= 1;
    }
    for (int i = 0; i <= 9; i++) {
      System.out.println(count[i]);
    }
  }

  private static void putBlack(HashMap<String, Integer> result, int a, int b, int h, int w) {
    for (int x = a - 2; x <= a; x++) {
      if (x < 1 || x > h - 2) {
        continue;
      }
      for (int y = b - 2; y <= b; y++) {
        if (y < 1 || y > w - 2) {
          continue;
        }
        String point = x + " " + y;
        if (!result.containsKey(point)) {
          result.put(point, Integer.valueOf(1));
        } else {
          int count = result.get(point);
          result.put(point, count + 1);
        }
      }
    }
  }
}
