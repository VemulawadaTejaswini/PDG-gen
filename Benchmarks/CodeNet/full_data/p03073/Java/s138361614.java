import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int x = 0;
    int y = 0;
    int d = 0;
    
    for (int i=0; i<n; i++) {
      d = Integer.parseInt(s.substring(i,i+1));
      if (d == i % 2) {
        x++;
      }
      if (d == (i+1) % 2) {
        y++;
      }
    }
   
    System.out.println(Math.min(x,y));
  }
}