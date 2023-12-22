import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i = 1; i <= n; i++) {
      int num = sc.nextInt();
      map.put(num, i);
    }
    for(int num: map.values()) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
