import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] group = {-1, 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0};
    String ans = "No";
    if(group[x] == group[y]) ans = "Yes";
    System.out.println(ans);
  }
}