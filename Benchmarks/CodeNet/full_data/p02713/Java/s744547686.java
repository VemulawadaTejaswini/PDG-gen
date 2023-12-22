import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    
    int sum = 0;
    
    for(int i=1;i<K+1;i++) {
      for(int j=1;j<K+1;j++){
        for(int k=1;k<K+1;k++) sum += gcd(i, j, k);
      }
    }
    
    System.out.println(sum);
  }
  public static int gcd(int a, int b) {
    if (a < b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    int r = -1;
    while (r != 0) {
        r = a % b;
        a = b;
        b = r;
    }
    return a;
  }
  public static int gcd(int a, int b, int c) {
    return gcd(gcd(a, b), c);
  }
}