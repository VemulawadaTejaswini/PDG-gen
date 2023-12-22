import java.util.*;

public class main {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int ans = 0;
      for(int i = 0; i < 4; i++) {
          String next = String.valueOf(s.charAt(i));
          if(next == "+") {
               i++;
          } else if(next == "-") {
               i--;
         }
      }
      System.out.println(ans);
  }
}
