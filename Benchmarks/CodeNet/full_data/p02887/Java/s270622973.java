import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    sc.close();
    int i = 0;
    int count = 0;
    while (i < n) {
      char head = s.charAt(i++);
      while (i < n && s.charAt(i) == head) i++;
      count++;
    }
    System.out.println(count);
  }
}