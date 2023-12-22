import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    System.out.println(S.substring(0, 3) + "8" + S.substring(4, S.length()));
  }
}