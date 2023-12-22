import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder ans = new StringBuilder();
    ans.append(str.charAt(0));
    ans.append(str.length() - 2);
    ans.append(str.charAt(str.length() - 1));
    System.out.println(ans);
  }
}