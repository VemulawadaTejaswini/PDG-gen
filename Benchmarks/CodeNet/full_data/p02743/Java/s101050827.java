import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long m = scan.nextLong();
    long k = scan.nextLong();
    double x = Math.sqrt(n);
    double y = Math.sqrt(m);
    if((x + y)*2 < k-m-n){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}