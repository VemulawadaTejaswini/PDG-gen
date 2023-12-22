import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    String aString = IntStream.range(0, b).mapToObj(i -> String.valueOf(a))
      .collect(Collectors.joining());
    String bString = IntStream.range(0, a).mapToObj(i -> String.valueOf(b))
      .collect(Collectors.joining());
    List<String> list = Arrays.asList(aString, bString);
    Collections.sort(list);
    pw.println(list.get(0));
  }
}
