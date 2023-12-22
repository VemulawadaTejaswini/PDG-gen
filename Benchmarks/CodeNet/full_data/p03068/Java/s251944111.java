import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();
    int k = Integer.parseInt(sc.next());
    
    String target = s.substring(k,k+1);
    String check = "";
    String ans = "";
    
    for (int i=0; i<n; i++) {
      check = s.substring(i,i+1);
      if (check.equals(target)) {
        ans += check;
      } else {
        ans += "*";
      }
    }
    System.out.println(ans);
  }
}
