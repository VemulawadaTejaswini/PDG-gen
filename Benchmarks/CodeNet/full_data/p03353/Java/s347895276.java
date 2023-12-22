import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
    int n = sc.nextInt();
    SortedSet<String> set = new TreeSet<>();
    for (int i = 1; i <= 5; i++) {
      for (int j = 0; j < line.length() + 1 - i; j++) {
        set.add(line.substring(j, j + i));
      }
    }
    int count = 1;
    for (String s : set) {
      if (count == n) {
        System.out.println(s);
        return;
      }
      count++;
    }
  }
}