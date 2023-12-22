import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nc = sc.next();
    int cnt = 0;
    for (int i = 0; i < nc.length(); i++) {
      if (nc.charAt(i) == 'A' || nc.charAt(i) == 'C' || nc.charAt(i) == 'G' || nc.charAt(i) == 'T') {
        cnt++;
      } else if (cnt > 0
          && (nc.charAt(i) != 'A' || nc.charAt(i) != 'C' || nc.charAt(i) != 'G' || nc.charAt(i) != 'T')) {
            break;
      }
    }
    System.out.println(cnt);
  }
}