import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer a[] = new Integer[N];
    int ans = 0;
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      ans += a[i] -1;
    }
    System.out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}