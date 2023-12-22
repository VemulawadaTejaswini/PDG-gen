import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    long x = scan.nextLong();

    long c = (long) a/x;
    long d = (long) b/x;

    long sum = 0;
    if (c*x == a){
      sum += 1;
    }
    sum += (long) (d-c);
    System.out.println(sum);
  }

}
