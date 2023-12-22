import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N == 0) {
      System.out.println(0);
      return;
    }
    int M = sc.nextInt();
    Integer[] items = new Integer[N];
    Arrays.setAll(items, i -> sc.nextInt());
    Arrays.sort(items, Comparator.reverseOrder());
    int index, tmp;
    for (int i = 0; i < M; i++) {
      items[0] /= 2;
      index = 1;
      while (index < N && items[0] < items[index])
        index++;
      tmp = items[0];
      items[0] = items[index];
      items[index] = tmp;
    }
    System.out.println(Arrays.toString(items));
    long sum = 0;
    for (Integer item : items)
      sum += item;
    System.out.println(sum);
  }
}