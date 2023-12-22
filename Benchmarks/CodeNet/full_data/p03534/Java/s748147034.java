import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if(judge_parin(s)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
  public static boolean judge_parin(String s) {
    int a_c = 0, b_c = 0, c_c = 0;
    int gap = 0;
    char[] list = s.toCharArray();
    for(int i = 0; i < list.length; i++) {
      if(list[i] == 'a') {
        a_c++;
      } else if(list[i] == 'b') {
        b_c++;
      } else {
        c_c++;
      }
    }
    gap = max(a_c, b_c, c_c) - min(a_c, b_c, c_c);
    if(gap > 1) {
      return true;
    } else {
      return false;
    }
  }
  public static int max(int a, int b, int c) {
    int max = a;
    if(b > max) max = b;
    if(c > max) max = c;
    return max;
  }
  public static int min(int a, int b, int c) {
    int min = a;
    if(b < min) min = b;
    if(c < min) min = c;
    return min;
  }
}
