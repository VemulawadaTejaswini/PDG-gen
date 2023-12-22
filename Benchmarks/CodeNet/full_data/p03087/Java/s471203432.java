import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int l[] = new int[Q];
    int r[] = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    String item = "AC";
    for (int i = 0; i < Q; i++) {
      String target = S.substring(l[i] - 1, r[i]);
      System.out.println(target);
      int count = 0;
      int s = 0;
      while (s < target.length()) {
        int index = target.indexOf(item, s);
        if (index == -1)
          break;
        s += item.length();
        count++;
      }
      System.out.println(count);
    }

  }
}