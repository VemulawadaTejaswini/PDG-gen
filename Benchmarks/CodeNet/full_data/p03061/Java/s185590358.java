import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int tmp;
    int L[] = new int[n-1];
    int R[] = new int[n-1];
    int x;
    int y;
    
    for (int i=0; i<n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    
    L[0] = a[0];
    
    for (int i=1; i<n-1; i++) {
      x = L[i-1];
      y = a[i];
      if (x < y) {
        tmp = x;
        x = y;
        y = tmp;
      }
      L[i] = gcd(x, y);
    }
    
    R[0] = a[n-1];
    
    for (int i=1; i<n-1; i++) {
      x = R[i-1];
      y = a[n-1-i];
      if (x < y) {
        tmp = x;
        x = y;
        y = tmp;
      }
      R[i] = gcd(x, y);
    }
    
	int gcdval;
    int max = L[n-2];
    
    if (n==2) {
      System.out.println(Math.max(a[0], a[1]));
      return;
    } else {
      for (int i=0; i<n-2; i++){
        x = L[i];
        y = R[n-3-i];
        if (x > y) {
          tmp = x;
          x = y;
          y = tmp;
        }
        gcdval = gcd(x, y);
        
        if (gcdval > max) {
          max = gcdval; 
        }
      }
    }
    
    if (R[n-2] > max) {
      max = R[n-2];
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
