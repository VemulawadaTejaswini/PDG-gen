
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int cnt = 0;

    for (int i = A; i <= B; i++) {
      cnt = isPalindromic(i) ? cnt + 1 : cnt;
    }

    System.out.println(cnt);
  }

  static boolean isPalindromic(int num) {
    char[] arr = String.valueOf(num).toCharArray();
    for (int i = 0; i < arr.length / 2; i++) {
      if (arr[i] != arr[arr.length - 1 - i])
        return false;
    }
    return true;
  }

}
