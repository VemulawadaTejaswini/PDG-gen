import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int A = S.indexOf('A');
    int Z = S.lastIndexOf('Z');
    System.out.println(Z - A + 1);
  }
}
