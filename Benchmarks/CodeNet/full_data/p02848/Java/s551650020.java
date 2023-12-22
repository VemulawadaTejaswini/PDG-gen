import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String str = sc.next();
    char[] ch = new char[str.length()];
    for(int i = 0; i < str.length(); i++) ch[i] = str.charAt(i);
    for(int i = 0; i < str.length(); i++) {
      if(ch[i] + n <= 'Z') ch[i] += n;
      else ch[i] -= (26 - n);
    }
    System.out.println(ch);
  }
}
