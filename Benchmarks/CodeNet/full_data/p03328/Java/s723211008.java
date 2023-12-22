import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int height =0;
    for (int i=0; i<b-a; i++) {
      height += i;
    }
    height -= a;
    System.out.println(height);
  }
}