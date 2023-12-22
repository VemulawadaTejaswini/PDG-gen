import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    List<Character> rem = new ArrayList<>();
    for (char ch : s) if (ch != 'x') rem.add(ch);
    if (palindrome(rem)) {
      System.out.println(s.length - rem.size());
    } else {
      System.out.println(-1);
    }
  }

  private static boolean palindrome(List<Character> list) {
    int i = 0;
    int j = list.size() - 1;
    while (i < j && list.get(i).equals(list.get(j))) {
      i++;
      j--;
    }
    return i >= j;
  }
}
