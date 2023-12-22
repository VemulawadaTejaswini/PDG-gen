import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int cnt = 0;

    List<Integer> listR = new ArrayList<Integer>();
    List<Integer> listG = new ArrayList<Integer>();
    List<Integer> listB = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      String c;
      if (i == n - 1) {
        c = s.substring(i);
      } else {
        c = s.substring(i, i + 1);
      }

      if (c.equals("R")) {
        listR.add(i);
      } else if (c.equals("B")) {
        listB.add(i);
      } else {
        listG.add(i);
      }
    }

    cnt = listR.size() * listB.size() * listG.size();

    int tmp = 0;
    for (int r : listR) {
      for (int g : listG) {
        for (int b : listB) {
          if (Math.abs(g - r) == Math.abs(b - g) || Math.abs(g - r) == Math.abs(r - b) || Math.abs(b - g) == Math.abs(r - b)) {
            tmp++;
          }
        }
      }
    }

    System.out.println(cnt - tmp);

  }
}
