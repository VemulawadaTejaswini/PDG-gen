import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long x = scan.nextInt();
    long y = scan.nextInt();
    long z = scan.nextInt();

    float rx = Math.sqrt(x*y);
    rx = 2*rx + x + y;
    if(rx < z){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
