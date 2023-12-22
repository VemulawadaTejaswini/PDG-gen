import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (Integer.valueOf(S.substring(0, 4)) <= 2019) {
      if (Integer.valueOf(S.substring(5, 6)) != 0) {
        System.out.println("TBD");
        return;
      }
      if (Integer.valueOf(S.substring(6, 7)) < 5 && (int) Integer.valueOf(S.substring(8, 10)) < 31) {
        System.out.println("Heisei");
        return;
      }
    }
    System.out.println("TBD");
  }
}