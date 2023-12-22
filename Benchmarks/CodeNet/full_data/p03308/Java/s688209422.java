import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String m = sc.nextLine();
    String[] mm = m.split(" ");
    int[] o = new int[n];
    for (int i = 0; i < n; i++) {
      o[i] = Integer.parseInt(mm[i]);
    }
    Arrays.sort(o);
    System.out.println(o[n - 1] - o[0]);
  }
}