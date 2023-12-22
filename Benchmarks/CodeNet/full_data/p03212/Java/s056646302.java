import java.util.*;

public class Main {
  public static int N;
  public static ArrayList<Long> list = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    dfs(0L);
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      long num = list.get(i);
      String s_num = Long.toString(num);
      if (num <= N && s_num.contains("3") && s_num.contains("5") && s_num.contains("7")) {
        count++;
      }
    }
    System.out.println(count);
  }

  public static void dfs(long n) {
    if (n >= 1000000000) {
      return;
    }
    list.add(n);
    dfs(n * 10 + 3);
    dfs(n * 10 + 5);
    dfs(n * 10 + 7);
  }
}
