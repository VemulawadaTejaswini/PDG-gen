import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Q = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[][] queries = new char[Q][2];
    for (int i = 0; i < Q; i++) {
      queries[Q - i - 1][0] = scanner.next().charAt(0);
      queries[Q - i - 1][1] = scanner.next().charAt(0);
    }

    Stack<Character> stack = new Stack<>();
    int i = s.length - 1;
    int mr = 0;
    for (int j = 0; j < Q; j++) {
      if (i >= 0 && s[i] == queries[j][0] && queries[j][1] == 'R') {
        stack.push(s[i]);
        i--;
      }
      if (!stack.isEmpty() && stack.peek() == queries[j][0] && queries[j][1] == 'L') {
        stack.pop();
        i++;
      }
      mr = Math.max(mr, stack.size());
    }

    stack.clear();
    i = 0;
    int ml = 0;
    for (int j = 0; j < Q; j++) {
      if (i < N && s[i] == queries[j][0] && queries[j][1] == 'L') {
        stack.push(s[i]);
        i++;
      }
      if (!stack.isEmpty() && stack.peek() == queries[j][0] && queries[j][1] == 'R') {
        stack.pop();
        i--;
      }
      ml = Math.max(ml, stack.size());
    }

    System.out.println(N - Math.min(ml + mr, N));
  }
}
