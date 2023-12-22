import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    int c = 1;
    int b = 0;
    int ans = 0;
    
    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    
    for(int i=0; i<n; i++){
      if(a[i] == c){
        c++;
      } else {
        b++;
      }
    }
    
    if(b != 0 && c == 1){
      b = -1; 
    }
    
    System.out.println(b);
    
  }
  
  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}
