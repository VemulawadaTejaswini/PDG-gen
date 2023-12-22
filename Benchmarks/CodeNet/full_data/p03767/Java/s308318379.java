import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] a = sc.nextLine().split(" ");
    List<String> list = Arrays.asList(a);
    list.sort(Comparator.reverseOrder());
    String[] tmp = (String[]) list.toArray(new String[list.size()]);
    int[] ia = new int[3 * n];
    for (int i = 0; i < 3 * n; i++) {
      ia[i] = Integer.parseInt(tmp[i]);
    }
    long ans = 0;
    for (int i = 1, j = 0; j < n; i += 2, ++j)
      ans += ia[i];
    System.out.println(ans);
  }
}