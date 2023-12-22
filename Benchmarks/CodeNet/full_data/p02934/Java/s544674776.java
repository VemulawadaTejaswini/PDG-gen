import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    double g[] = new double[n];
    double s = 0.0;
    double ans = 0.0;
    
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }

    
    for(int i=0; i<n; i++){
      g[i] = 1.0 / a[i];
      s += g[i];
    }
    
    ans = 1.0/s;
    
    System.out.println(ans);
    
  }
}
