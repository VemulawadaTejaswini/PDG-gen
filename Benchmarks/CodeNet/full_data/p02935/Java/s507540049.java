import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    int v[] = new int[n];
    double g[] = new double[n];
    double s = 0.0;
    double ans = 0.0;
    
    for(int i=0; i<n; i++) {
      v[i] = Integer.parseInt(sc.next());
    }
    
    Arrays.sort(v);
    
    g[0] = 0.0 + (double) v[0];
    for(int i=0; i<n-1; i++){
      g[i+1] = (g[i] + v[i+1]) * 0.50;
    }
    
    
    System.out.println(g[n-1]);
    
  }
}
