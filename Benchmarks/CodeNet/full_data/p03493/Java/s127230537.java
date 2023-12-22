import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    char[] c = s.toCharArray();
    
    int cnt = 0;
    if(c[0] == '1') cnt++;
    if(c[1] == '1') cnt++;
    if(c[2] == '1') cnt++;
    
    System.out.println(cnt);
  }
}
