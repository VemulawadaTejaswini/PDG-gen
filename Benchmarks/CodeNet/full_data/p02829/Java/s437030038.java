import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    ArrayList<Integer> c = new ArrayList<Integer>();
    c.add(1);
    c.add(2);
    c.add(3);

    c.remove(c.indexOf(a));
    c.remove(c.indexOf(b));
    System.out.println(c.get(0));
  }
}