import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Long K = sc.nextLong();
    char ans = '1';
    int count = 0;
    for(int i=0; i<K; i++){
      if(S.charAt(i) != '1'){
        ans = S.charAt(i);
        break;
      }
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}