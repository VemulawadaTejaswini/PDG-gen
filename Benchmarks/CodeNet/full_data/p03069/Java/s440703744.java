import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();

    String check = "";
    int flg = 0;
    int cnt = 0;
    
    for (int i=0; i<n; i++) {
      check = s.substring(i,i+1);
      if (check.equals("#") && flg == 0) {
        flg++;
      }
      if (flg == 1 && check.equals(".")) {
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}
