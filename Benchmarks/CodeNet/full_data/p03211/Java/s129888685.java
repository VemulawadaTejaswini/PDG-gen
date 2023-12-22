import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] n = new int[s.length() - 2];
    int min = 1000;
    for (int i = 0; i < n.length; i++) {
      n[i] = Integer.parseInt(s.substring(i, i + 2));
    }
    for (int i = 0; i < n.length; i++) {
      if (n[i] < min) {
        min = n[i];
      }
    }
    System.out.println(min);
  }

}
