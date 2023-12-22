import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();


    int diffs = 0;
    char prev = s.charAt(0);
    for (char c : s.toCharArray()) {
      diffs += (prev != c) ? 1 : 0;
      prev = c;
    }
    System.out.println(n - 1 - Math.max(0, diffs - k * 2));
  }
}
