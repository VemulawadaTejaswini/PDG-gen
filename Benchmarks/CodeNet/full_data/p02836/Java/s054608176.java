import java.util.Scanner;

public class Main {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int sum = 0;
    int left = 0;
    int right = str.length() - 1;
    for (; left < right; left++, right--) {
      if (str.charAt(left) != str.charAt(right)) sum++;
    }
    System.out.println(sum);
  }
}
