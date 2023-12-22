import java.util.*;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    for (char c = 'a'; c <= 'z'; c++) {
      int flag = 1;
      for (int i = 0; i < s.length; i++) {
        if (s[i] == c) {
          flag = -1;
        }
      }
      if (flag == 1) {
        System.out.println(c);
        return;
      }
    }
    System.out.println("None");
  }
}
