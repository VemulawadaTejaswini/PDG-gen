import java.util.*;

public class Main{
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    long r2 = H/2;
    long r1 = H-r2;
    long c2 = W/2;
    long c1 = W-c2;
    long s = r1*c1+r2*c2;
    System.out.print(s);
    
  }
  
}