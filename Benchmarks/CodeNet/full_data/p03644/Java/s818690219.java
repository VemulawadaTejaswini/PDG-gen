import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int ans = 0;
    if (i%2==0) {
      ans = i;
    } else {
      ans = i - 1;
    }
    System.out.println(ans);
  }
}
