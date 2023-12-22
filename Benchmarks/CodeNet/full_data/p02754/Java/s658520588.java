import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long sum = 0;
    
    sum = (N / (A + B)) * A;
    
    if(N %(A+B) > A) {
      sum = sum + A;
    } else {
      sum = sum + N % (A+B);
    }
    System.out.println(sum);
  }
}