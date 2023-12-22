import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int point;
    boolean con1 = true;
    boolean con2 = true;
    
    for(int i = 0; i < s.length() && con1;i++) {
      con2 = true;
      for(int j = i; j < (s.length()+i) && con2;j++) {
      	if(j > s.length()) point = j - s.length();
        else point = j;
        
        if(s.charAt(j - i) != t.charAt(point)) con2 = false;
      }
      if(con2) con1 = false;
    }
        
    if(!con1) System.out.println("Yes");
    else System.out.println("No");
  }
}
