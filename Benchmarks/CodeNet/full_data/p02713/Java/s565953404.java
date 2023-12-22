import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int ans = 0;

    for(int i = 1; i < k; i++){
      for(int j = 1; j < k; j++){
        for(int l = 1; l < k; l++){
          ans += gcd(gcd(i, j), l);
        }
      }
    }

    System.out.println(ans + k);
  }

  public static int gcd(int a, int b){
    int ans = 0;

    for(int i = 1; i <= Math.max(a, b); i++){
      if(a % i == 0 && b % i == 0 && ans < i){
        ans = i;
      }
    }

    return ans;
  }
}
