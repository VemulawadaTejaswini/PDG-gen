import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = 1;

    for(int i = 2; i <= Math.min(a, b); i++){
      if(a % i == 0 && b % i == 0){
        a = a / i;
        b = b / i;
        ans *= i;
      } if(i == Math.min(a, b)){
        ans *= a * b;
        System.out.println(ans);
      }
    }
  }
}
