import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.next());
    s.replace(5,6," ");
    s.replace(13,14," ");
    System.out.println(s);
  }
}