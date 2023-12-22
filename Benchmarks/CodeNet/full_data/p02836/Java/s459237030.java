import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    
    for (int i = 0; int < S.length/2 ;i++) {
      String a = S.charat(i);
      String b = S.charat(S.length-i-1);
      if (a == b) {
        count++;
      }
    }
    System.out.print(count);
  }
}