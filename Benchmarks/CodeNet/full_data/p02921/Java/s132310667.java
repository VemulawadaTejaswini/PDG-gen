import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    
    char[] s2 = s.toCharArray();
    char[] t2 = t.toCharArray();
    
    int cnt = 0;
    
    if(s2[0] == t2[0])
      cnt++;
    if(s2[1] == t2[1])
      cnt++;
    if(s2[2] == t2[2])
      cnt++;

    System.out.println(cnt);
    
  }
}