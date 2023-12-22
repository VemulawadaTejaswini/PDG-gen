import java.util.*;
public class Main {
  static String[] AZ = new String[] { "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z" };
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      int x = (int)(s.charAt(i) - 'A');
      sb.append(AZ[(x + n) % 26]);
    }
    System.out.println(sb.toString());
  }
}