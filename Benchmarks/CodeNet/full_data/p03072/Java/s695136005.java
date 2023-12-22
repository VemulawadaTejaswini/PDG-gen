import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int s = 0;
    int cnt = 0;

    for (int i=0; i<n; i++) {
      int h = sc.nextInt();
      if (h>=s) {
        cnt++;
        s = h;
      }
    }
    
    System.out.println(cnt);
  }
}