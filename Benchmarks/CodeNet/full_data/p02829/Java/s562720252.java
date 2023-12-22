import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    Set<Integer> candidate = new HashSet<>(Arrays.asList(1, 2, 3));
    candidate.remove(Integer.valueOf(sc.next()));
    candidate.remove(Integer.valueOf(sc.next()));
    pw.println(candidate.iterator().next());
  }
}
