import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] arr = sc.nextLine().split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        if (sb.length() != 0) {
          sb.append(" ");
        }
        sb.append(arr[i]);
      } else {
        if (sb.length() != 0) {
          sb.insert(0, " ");
        }
        sb.insert(0, arr[i]);
      }
    }
    if (n % 2 == 0) {
      System.out.println(sb.toString());
    } else {
      System.out.println(sb.reverse().toString());
    }
  }
}