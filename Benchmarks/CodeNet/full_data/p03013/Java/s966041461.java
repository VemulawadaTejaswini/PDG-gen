import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  static ArrayList<Integer> broken = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < m; ++i)
      broken.add(sc.nextInt());

    System.out.println(ways(0, n) % 100000007);
  }

  public static int ways(int start, int end) {
    if (broken.contains(start))
      return 0;
    if (start == end)
      return 1;
    if (start > end)
      return 0;
    return ways(start + 1, end) % 100000007 + ways(start + 2, end) % 100000007;
  }
}