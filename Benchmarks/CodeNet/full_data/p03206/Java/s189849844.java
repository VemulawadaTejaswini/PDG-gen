import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    String ans = "Christmas";
    for (int i = D; i < 25; i++) ans += " Eve";
    System.out.println(ans);
  }
}