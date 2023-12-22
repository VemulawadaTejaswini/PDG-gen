import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      int left = 0;
      for(; left < s.length(); left++) {
        if(s.charAt(left) == '.') continue;
        else break;
      }
      int right = s.length() - 1;
      for(; right >= left; right--)
        if(s.charAt(right) == '#') continue;
        else break;

      
      
      int cnt = 0;
      int i = left;
      for(; i <=right; i++) {
        if(s.charAt(i) == '.')
          break;
      }
      for(; i <= right; i++)
        if(s.charAt(i) == '.') cnt++;

      i = right;
      int cntBlack = 0;
      for(; i>= left; i--) {
        if(s.charAt(i) == '#') 
          break;
      }
      for(; i>= left; i--)
        if(s.charAt(i) == '#') 
          cntBlack++;
      cnt = Math.min(cnt, cntBlack);
      System.out.println(cnt);
  }
}