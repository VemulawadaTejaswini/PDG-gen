import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    for (int i = 0;i < q;i ++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int count = 0;
      for (int j = l - 1; j <= r - 2; j++) {
        if ("AC".equals(s.substring(j, j + 2))) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}