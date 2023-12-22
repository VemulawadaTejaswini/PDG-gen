import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int l[] = new int[n];
    int ans = 0;
    int y = 0;
    int cnt = 0;
    
    for (int i=0; i<n; i++) {
      l[i] = Integer.parseInt(sc.next());
    }

    for (int i=0; i<n; i++) {
      y += l[i];
      ans++;
      if (y > x) { break; }
    }

    System.out.println(ans);
  }
}
