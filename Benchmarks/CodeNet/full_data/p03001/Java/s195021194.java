import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double w = Integer.parseInt(sc.next());
    double h = Integer.parseInt(sc.next());
    double x = Integer.parseInt(sc.next());
    double y = Integer.parseInt(sc.next());
    int ans;
    int cnt = 0;

	Double s = w*h*0.5d;

    if (w%2 == 0 && h%2 == 0 && x == w/2 && y == h/2) {
      ans = 1;
    } else {
      ans = 0;
    }
    
    System.out.println(s + " " + ans);
  }
}
