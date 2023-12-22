import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    int len = S.length / 2;
    
    for (int i = 0; i < len; i++) {
      String a = S.charAt(i);
      String b = S.charAt(len-i-1);
      if (a == b) {
        count++;
      }
    }
    System.out.print(count);
  }
}