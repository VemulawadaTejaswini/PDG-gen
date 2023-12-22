import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int q = sc.nextInt();

      sc.nextLine();

      String line = sc.nextLine();

      int[] ans = new int[q];
      for (int i = 0; i < q; i++) {

        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.nextLine();

        ans[i] = get(line.substring(l - 1, r));
      }

      for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]);
      }
    }
  }

  private static int get(String target) {

    int count = 0;
    for (int i = 0; i < target.length() - 1; i++) {
      StringBuilder sb = new StringBuilder(String.valueOf(target.charAt(i)));
      sb.append(String.valueOf(target.charAt(i + 1)));
      if ("AC".equals(sb.toString())) {
        count++;
      }
    }
    return count;
  }
}