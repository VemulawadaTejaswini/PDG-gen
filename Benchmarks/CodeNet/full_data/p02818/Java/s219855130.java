import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();

    if(a > k){
      a -= k;
    } else if(b - k + a > 0){
      b = b - k + a; 
      a = 0;
    } else {
      a = 0;
      b = 0;
    }

    System.out.println(a + " " + b);
  }
}
