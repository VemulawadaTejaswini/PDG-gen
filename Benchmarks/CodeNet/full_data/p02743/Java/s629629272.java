import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    
    double X = Math.sqrt(A);
    double Y = Math.sqrt(B);
    
    double Z = A+B+(2*X*Y);
    System.out.println(Z<C ? "Yes" : "No");
  }
}