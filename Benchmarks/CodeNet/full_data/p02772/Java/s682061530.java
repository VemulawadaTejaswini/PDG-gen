import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ret = "APPROVED";
    for (int i = 0; i < N; i++) {
      int t = sc.nextInt();
      if (t%2==0) {
        if (t%3 != 0 && t%5!=0) {
          ret = "DENIED";
          break;
        }
      }
    }
    System.out.println(ret);
  }
}