import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();

    int max = 0;
    for (int i = 0; i < N; i++) {
      Set<Character> left = new HashSet<>();
      Set<Character> right = new HashSet<>();
      for (int j = 0; j < i; j++) left.add(S[j]);
      for (int j = i; j < N; j++) right.add(S[j]);
      int cnt = 0;
      for (char ch : left) if (right.contains(ch)) cnt++;
      max = Math.max(max, cnt);
    }
    System.out.println(max);
  }
}
