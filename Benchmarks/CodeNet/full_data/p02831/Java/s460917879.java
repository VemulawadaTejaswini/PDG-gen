import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans = 1;

    if(Math.max(a, b) % Math.min(a, b) == 0){
      ans = Math.max(a, b);
    } else {
      for(int i = 2; i <= Math.min(a, b); i++){
        if(a % i == 0 && b % i == 0){
          a = a / i;
          b = b / i;
          a *= i;
        }
        if(i == Math.min(a, b)){
          ans *= a * b;
          break;
        }
      }
    }

    System.out.println(ans);
  }
}
