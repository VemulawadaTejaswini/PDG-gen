import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    char[] c = s.toCharArray();
    
    int cnt = 0;
    if(c[0] == 'o') cnt++;
    if(c[1] == 'o') cnt++;
    if(c[2] == 'o') cnt++;
    
    System.out.println(700 + cnt*100);
  }
}
