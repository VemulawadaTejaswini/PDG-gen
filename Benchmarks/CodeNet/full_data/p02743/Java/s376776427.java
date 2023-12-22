import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long m = scan.nextLong();
    long k = scan.nextLong();
    double x = Math.sqrt(n);
    double y = Math.sqrt(m);
    double z = Math.sqrt(k);
    if((x + y) < z){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}