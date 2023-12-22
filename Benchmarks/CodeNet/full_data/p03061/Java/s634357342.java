import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int first = 0;
    
    for (int i=0; i<n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    
	int gcdval;
    int max = 0;
    
    if (n==2) {
      System.out.println(Math.max(a[0], a[1]));
      return;
    } else {
      for (int j=0; j<n; j++) {
        gcdval = a[0];
        for (int i=0; i<n-1; i++){
          if (i==j) { continue; }
          gcdval = gcd(gcdval, a[i+1]);
        }
        
        if (gcdval > max) {
          max = gcdval; 
        }
      }
    }
    
    System.out.println(max);
  }
  
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }

}
