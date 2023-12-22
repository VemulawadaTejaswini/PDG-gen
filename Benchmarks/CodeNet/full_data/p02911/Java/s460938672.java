import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int p[] = new int[n];
    int qi = 0;
    
    for (int i=0; i<n; i++) {
      p[i] = k-q;
    }
    
    for (int i=0; i<q; i++) {
      qi = Integer.parseInt(sc.next());
      p[qi-1]++;
    }

    for (int i=0; i<n; i++) {
      if (p[i]>0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    
  }
}
