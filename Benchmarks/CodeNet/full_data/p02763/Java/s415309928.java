import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    TreeSet<Integer>[] trees = new TreeSet[26];
    for (int i = 0; i < 26; i++) trees[i] = new TreeSet<>();
    for (int i = 0; i < N; i++) trees[S[i] - 'a'].add(i);

    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int type = scanner.nextInt();
      switch (type) {
        case 1:
          int p = scanner.nextInt() - 1;
          char c = scanner.next().charAt(0);
          trees[S[p] - 'a'].remove(p);
          trees[c - 'a'].add(p);
          S[p] = c;
          break;
        case 2:
          int l = scanner.nextInt() - 1;
          int r = scanner.nextInt() - 1;
          int cnt = 0;
          for (int j = 0; j < 26; j++) {
            Integer left = trees[j].ceiling(l);
            if (left != null && left <= r) cnt++;
          }
          System.out.println(cnt);
          break;
      }
    }
  }
}
