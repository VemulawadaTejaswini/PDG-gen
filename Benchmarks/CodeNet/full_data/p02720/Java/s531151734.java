import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    int current = 0;
    int i = 1;
    while (true) {
      if (isLunlun(i)) {
        current++;
      }
      if (k == current) {
        System.out.println(i);
        return;
      }
      i++;
    }
  }

  private static boolean isLunlun(int num) {
    char[] chars = Integer.toString(num).toCharArray();
    for (int i = 1; i < chars.length; i++) {
      int abs = Math.abs(chars[i] - chars[i - 1]);
      if (abs >= 2) {
        return false;
      }
    }
    return true;
  }
}
