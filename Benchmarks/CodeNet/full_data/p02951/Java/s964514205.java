import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next()),
        b = Integer.parseInt(sc.next()),
        c = Integer.parseInt(sc.next());
    System.out.println(
      Math.max(0, c - Math.max(0, a - b))
    );
  }
}
