import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuilder SS = new StringBuilder(S);
    SS = SS.replace(3,4,"8");
    System.out.println(SS);
  }
}