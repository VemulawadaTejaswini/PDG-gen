import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String item = sc.next();
    if (item.equals("A")) {
        System.out.println("T");
    } else if (item.equals("G")) {
        System.out.println("C");
    } else if (item.equals("T")) {
        System.out.println("A");
    } else if (item.equals("C")) {
        System.out.println("G");
    }
  }
}