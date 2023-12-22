import java.util.Scanner;

public class Main {
  public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextString();
    String t = sc.nextString();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.nextString();
    if (u.equals(s)) {
      a--;
    } else if (u.equals(t)) {
      b--;
    }
    System.out.println(a + " " + b);
  }
}