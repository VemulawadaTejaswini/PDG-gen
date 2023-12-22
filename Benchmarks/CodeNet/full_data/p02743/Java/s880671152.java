import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = C-A-B;
    if(D < 0 || D*D < 4*A*B){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
  }
}