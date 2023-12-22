import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    int[] position = new int[s.length()];
    int blockLength = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      String current = Character.toString(s.charAt(i));
      String next = Character.toString(s.charAt(i + 1));
      blockLength++;
      if (current.equals(next)) {
        continue;
      } else {
        position[i] += blockLength / 2;
        position[i + 1] += blockLength / 2;
        if (blockLength % 2 != 0) {
          position[i] += 1;
        }
        blockLength = 0;
        int nextBlockLength = 0;
        for (int j = i + 1; j < s.length(); j++) {
          if (j == s.length() - 1) {
            nextBlockLength++;
          }
          if (next.equals(Character.toString(s.charAt(j))) && j != s.length() - 1) {
            nextBlockLength++;
            continue;
          } else {
            position[i] += nextBlockLength / 2;
            position[i + 1] += nextBlockLength / 2;
            if (nextBlockLength % 2 != 0) {
              position[i + 1] += 1;
            }
            i = j - 1;
            break;
          }
        }
      }
    }
    boolean isFirst = true;
    for (int i = 0; i < s.length(); i++) {
      if (!isFirst) {
        pw.print(" ");
      }
      pw.print(position[i]);
      isFirst = false;
    }
  }
}
