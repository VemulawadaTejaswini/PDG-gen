import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    char[] chars = s.toCharArray();
    int[] a = new int[chars.length];
    int[] b = new int[chars.length];
    int[] c = new int[chars.length];

    int o = 0;
    int p = 0;
    int q = 0;
    for (int i = 0; i < n; i++) {
      if (chars[i] == 'R') {
        a[o] = i + 1;
        o++;
      }
      if (chars[i] == 'G') {
        b[p] = i + 1;
        p++;
      }
      if (chars[i] == 'B') {
        c[q] = i + 1;
        q++;
      }
    }

    int sum = 0;
    for (int i = 0; i < o; i++) {
      for (int j = 0; j < p; j++) {
        for (int k = 0; k < q; k++) {
          if (b[j] - a[i] != c[k] - b[j]) {
            sum++;
          }
        }
      }
    }
    System.out.println(sum);
  }
}
