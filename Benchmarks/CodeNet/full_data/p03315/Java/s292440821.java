import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    int ans = 0;
    for (int i = 0; i < 4; i++) ans += (S[i] == '+') ? 1 : -1;
    System.out.println(ans);
  }
}