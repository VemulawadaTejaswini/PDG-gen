import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] S = in.nextLine().toCharArray();
    int l = 0, r = 1, cnt = 0;
    while (r < S.length) {
      if (S[l] != S[r]) {
        cnt++;
      } else {
        l = r;
      }
      r++;
    }
    System.out.println(cnt * 2);
  }
}