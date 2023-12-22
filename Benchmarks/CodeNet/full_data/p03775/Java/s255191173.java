import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long ans = 10;

    for(int i = 1; i <= Math.sqrt(n); i++){
      if(n % i == 0){
        long buf = String.valueOf(n / i).length();
        if(ans > buf){
          ans = buf;
        }
      }
    }

    System.out.println(ans);
  }
}
