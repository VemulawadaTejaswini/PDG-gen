import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int o = sc.nextInt();
    if (m != n | m != o) {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
  }
}