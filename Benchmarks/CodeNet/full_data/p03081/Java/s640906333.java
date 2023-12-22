import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int Q = Integer.parseInt(scanner.next());
    String s = scanner.next();
    String[] t = new String[Q];
    String[] d = new String[Q];
    for (int i = 0; i < Q; i++) {
      t[i] = scanner.next();
      d[i] = scanner.next();
    }
    scanner.close();
    int[] line = new int[s.length()];
    Arrays.fill(line, 1);
    for (int i = 0; i < Q; i++) {
      for (int j = 0; j < s.length(); j++) {
        if (t[i].charAt(0) == s.charAt(j)) {
          if (d[i].equals("R")) {
            if (j != s.length() - 1) {
              line[j + 1] += line[j];
            }
          } else {
            if (j != 0) {
              line[j - 1] += line[j];
            }
          }
          line[j] = 0;
        }
      }
    }
    int sum = 0;
    for (int i : line) {
      sum += i;
    }
    System.out.println(sum);
  }

}
