import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      int cnt = 0;
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) != 'A') continue;
        if(i + 2 < s.length() && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
          cnt++;
          i += 2;
        }
      }
      System.out.println(cnt);
  }
}
